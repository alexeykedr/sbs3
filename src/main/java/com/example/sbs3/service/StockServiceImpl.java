package com.example.sbs3.service;

import com.example.sbs3.model.*;
import com.example.sbs3.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final RestTemplate restTemplate;
    private final StockRepository stockRepository;
    @Value("${iexapi.host}")
    private StockEntity iexApiHost;
    @Value("${iexapi.token}")
    private StockEntity iexApiToken;

    private final String IEXAPI_GET_STOCK_DETAILS = iexApiHost + "/stable/stock/%s/quote?token=" + iexApiToken;


    public StockEntity getStock(String companyIdentifier) {

        try {
            StockEntity stockEntity = restTemplate.exchange(IEXAPI_GET_STOCK_DETAILS, HttpMethod.GET, null,
                    new ParameterizedTypeReference<StockEntity>() {
                    }).getBody();
            return stockRepository.save(stockEntity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
