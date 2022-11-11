package com.example.sbs3.service;

import com.example.sbs3.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDataService {

    @Autowired
    private StockClient stockClient;

    List<Company> listCompany (){
        return stockClient.getAllCompany();
    }

}
