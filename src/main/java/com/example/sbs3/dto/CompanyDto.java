package com.example.sbs3.dto;

import com.example.sbs3.model.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    // поля в бд
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;        // id?
    private String symbol;  // id?
    private String name;
    private String date;
    private String currency;
    private String figi;
    private BigInteger cik;

    // поля не в бд
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
        return new CompanyEntity();
    }

    public CompanyDto fromEntity(CompanyEntity entity) {
        return  new CompanyDto();
    }


}
