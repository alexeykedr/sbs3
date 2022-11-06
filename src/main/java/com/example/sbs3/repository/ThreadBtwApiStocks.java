package com.example.sbs3.repository;

import com.example.sbs3.model.Company;

public interface ThreadBtwApiStocks {

    // для обогащения stocks данными
    public String getStocksData(Long id);



    // для обработки потоками из очереди
    public String getDataForCompany(Company company);
}
