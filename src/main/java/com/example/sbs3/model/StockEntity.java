package com.example.sbs3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock")
public class StockEntity {

     /*поля в бд*/
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long id;                        // id?
    private String symbol;                  // id?
    private BigDecimal close;               // цена на момент закрытия биржи
    private String companyName;             // имя компании
    private String currency;                // валюта
    private BigDecimal high;                // самая высокая цена
    private BigInteger latestVolume;        // объем акций вне работы рынка
    private BigDecimal low;                 // самая низкая цена
    private BigDecimal open;                // цена на момент открытия биржи
    private BigInteger volume;              // объем акций, обновляется только после открытия рынка

    // поля не в бд
    private BigInteger avgTotalVolume;
    private String calculationPrice;
    private BigDecimal change;
    private BigDecimal changePercent;
    private String closeSource;
    private BigInteger closeTime;
    private BigDecimal delayedPrice;
    private BigInteger delayedPriceTime;
    private BigDecimal extendedChange;
    private BigDecimal extendedChangePercent;
    private BigDecimal extendedPrice;
    private BigInteger extendedPriceTime;
    private String highSource;
    private BigInteger highTime;
    private BigDecimal iexAskPrice;
    private BigInteger iexAskSize;
    private BigDecimal iexBidPrice;
    private BigInteger iexBidSize;
    private BigDecimal iexClose;
    private BigInteger iexCloseTime;
    private BigInteger iexLastUpdated;
    private BigDecimal iexMarketPercent;
    private BigDecimal iexOpen;
    private BigInteger iexOpenTime;
    private BigDecimal iexRealtimePrice;
    private BigInteger iexRealtimeSize;
    private BigInteger iexVolume;
    private BigInteger lastTradeTime;
    private BigDecimal latestPrice;
    private String latestSource;
    private String latestTime;
    private BigInteger latestUpdate;
    private String lowSource;
    private BigInteger lowTime;
    private BigInteger marketCap;
    private BigDecimal oddLotDelayedPrice;
    private BigInteger oddLotDelayedPriceTime;
    private BigInteger openTime;
    private String openSource;
    private BigDecimal peRatio;
    private BigDecimal previousClose;
    private BigInteger previousVolume;
    private String primaryExchange;
    private BigDecimal week52High;
    private BigDecimal week52Low;
    private BigDecimal ytdChange;
    private Boolean isUSMarketOpen;


}

