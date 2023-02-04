package com.example.sbs3.dto;

import com.example.sbs3.model.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDto {
    private String symbol;
    private String name;
    private String date;
    private String currency;
    private String figi;
    private BigInteger cik;
    private String exchange;
    private String exchangeSuffix;
    private String exchangeName;
    private String exchangeSegment;
    private String exchangeSegmentName;
    private String type;
    private String region;
    private Boolean isEnabled;
    private String lei;


    public CompanyEntity toEntity() {
        return CompanyEntity.builder()
                .symbol(this.symbol)
                .name(this.name)
                .date(this.date)
                .currency(this.currency)
                .figi(this.figi)
                .cik(this.cik)
                .build();
    }

    public CompanyDto fromEntity(CompanyEntity entity) {
        return  com.example.sbs3.dto.CompanyDto.builder()
                .symbol(this.symbol)
                .date(this.date)
                .name(this.name)
                .currency(this.currency)
                .figi(this.figi)
                .cik(this.cik)
                .exchange(this.exchange)
                .exchangeSuffix(this.exchangeSuffix)
                .exchangeName(this.exchangeName)
                .exchangeSegment(this.exchangeSegment)
                .exchangeSegmentName(this.exchangeSegmentName)
                .type(this.type)
                .region(this.region)
                .isEnabled(this.isEnabled)
                .lei(this.lei)
                .build();
    }


}
