package com.example.sbs3.service;

import com.example.sbs3.dto.StockDto;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface StockService {

    public ConcurrentLinkedQueue<StockDto> getStock(String companyIdentifier);
}
