package com.example.sbs3.job;

import com.example.sbs3.model.CompanyEntity;
import com.example.sbs3.service.CompanyService;
import com.example.sbs3.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor
public class ProcessCompaniesJob {

    private final CompanyService companyService;
    private final StockService stockService;


    @Scheduled(cron = "*/5 * * * * ?")
    public void process(){
        List<CompanyEntity> companies = companyService.getAllCompany();

        companies.forEach(c -> {
            stockService.getStock(c.getSymbol());
        });
    }
    public void showDetails(){
        System.out.println("test showDetails");
    }
}
