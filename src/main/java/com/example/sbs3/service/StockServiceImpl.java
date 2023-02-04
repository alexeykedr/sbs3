package com.example.sbs3.service;

import com.example.sbs3.dto.*;
import com.example.sbs3.model.*;
import com.example.sbs3.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final RestTemplate restTemplate;
    private final StockRepository stockRepository;
    private StockDto stockDto;
    private StockDto stockDtoLocal;

    @Value("${stock.host}")
    private StockEntity stockHost;
    @Value("${stock.token}")
    private StockEntity stockToken;
    private String companyShortName = new CompanyEntity().getSymbol();
    ConcurrentLinkedQueue<StockDto> concurrentLinkedQueueStock;


    private final String IEXAPI_GET_STOCK_DETAILS = stockHost + "/v1/data/core/quote/" + companyShortName + "?token=" + stockToken;
    //https://api.iex.cloud/v1/data/core/quote/aapl?token=sk_03d409871b154d1a8d94265f3fae0239

    public ConcurrentLinkedQueue<StockDto> getStock(String companyShortName) {
        CompletableFuture<StockDto> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                StockDto stockDto = restTemplate.exchange(IEXAPI_GET_STOCK_DETAILS, HttpMethod.GET, null,
                                new ParameterizedTypeReference<StockDto>() {
                                })
                        .getBody();

            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
//            return completableFuture; //why I can't return completableFuture?
//            return StockDto;
            return stockDto;
        });


        //TODO: use async that returns CompletableFuture
        if (Objects.isNull(stockDto)) {
            log.debug("stockDto is null");
        }

        // конвертирую StockDto в StockEntity
        StockEntity stockEntity = stockDto.toEntity();

        //TODO: optimize - use save all


        //как все собрать в одну колллекцию, может так?

        for (int i = 0; i < concurrentLinkedQueueStock.size() ; i++) {
            concurrentLinkedQueueStock.add(stockDto);

        }


        log.debug("saved stock");
        return concurrentLinkedQueueStock;
//        return stockRepository.save(stockEntity);


    }

}


