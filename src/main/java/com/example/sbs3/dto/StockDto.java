package com.example.sbs3.dto;

import com.example.sbs3.model.StockEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockDto {

    private String symbol;

    private BigDecimal close;
    private String companyName;
    private String currency;
    private BigDecimal high;
    private BigInteger latestVolume;
    private BigDecimal low;
    private BigDecimal open;
    private BigInteger volume;
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

    //TODO: add conversion methods

    public StockEntity toEntity() {
        return StockEntity.builder()
                .symbol(this.symbol)
                .close(this.close)
                .companyName(this.companyName)
                .currency(this.currency)
                .high(this.high)
                .latestVolume(this.latestVolume)
                .low(this.low)
                .open(this.open)
                .volume(this.volume)
                .build();
    }


    public StockDto fromEntity() {
        return StockDto.builder()
                .symbol(this.symbol)
                .close(this.close)
                .companyName(this.companyName)
                .currency(this.currency)
                .high(this.high)
                .latestVolume(this.latestVolume)
                .low(this.low)
                .open(this.open)
                .volume(this.volume)
                .avgTotalVolume(this.avgTotalVolume)
                .calculationPrice(this.calculationPrice)
                .change(this.change)
                .changePercent(this.changePercent)
                .closeSource(this.closeSource)
                .closeTime(this.closeTime)
                .delayedPrice(this.delayedPrice)
                .delayedPriceTime(this.delayedPriceTime)
                .extendedChange(this.extendedChange)
                .extendedChangePercent(this.extendedChangePercent)
                .extendedPrice(this.extendedPrice)
                .extendedPriceTime(this.extendedPriceTime)
                .highSource(this.highSource)
                .highTime(this.highTime)
                .iexAskPrice(this.iexAskPrice)
                .iexAskSize(this.iexAskSize)
                .iexBidPrice(this.iexBidPrice)
                .iexBidSize(this.iexBidSize)
                .iexClose(this.iexClose)
                .iexCloseTime(this.iexCloseTime)
                .iexLastUpdated(this.iexLastUpdated)
                .iexMarketPercent(this.iexMarketPercent)
                .iexOpen(this.iexOpen)
                .iexOpenTime(this.iexOpenTime)
                .iexRealtimePrice(this.iexRealtimePrice)
                .iexRealtimeSize(this.iexRealtimeSize)
                .iexVolume(this.iexVolume)
                .lastTradeTime(this.lastTradeTime)
                .latestPrice(this.latestPrice)
                .latestSource(this.latestSource)
                .latestTime(this.latestTime)
                .latestUpdate(this.latestUpdate)
                .lowSource(this.lowSource)
                .lowTime(this.lowTime)
                .marketCap(this.marketCap)
                .oddLotDelayedPrice(this.oddLotDelayedPrice)
                .oddLotDelayedPriceTime(this.oddLotDelayedPriceTime)
                .openTime(this.openTime)
                .openSource(this.openSource)
                .peRatio(this.peRatio)
                .previousClose(this.previousClose)
                .previousVolume(this.previousVolume)
                .primaryExchange(this.primaryExchange)
                .week52High(this.week52High)
                .week52Low(this.week52Low)
                .ytdChange(this.ytdChange)
                .isUSMarketOpen(this.isUSMarketOpen)
                .build();
    }

}
