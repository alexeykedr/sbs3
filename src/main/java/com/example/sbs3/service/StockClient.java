package com.example.sbs3.service;

import com.example.sbs3.model.Company;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class StockClient {

    private RestTemplate restTemplate = new RestTemplate();

    public List<Company> getAllCompany()  {
        String url = "https://sandbox.iexapis.com/stable/ref-data/symbols?token=Tpk_ee567917a6b640bb8602834c9d30e571";

        try {
            return List.of(restTemplate.getForObject(new URI(url) , Company.class));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}

