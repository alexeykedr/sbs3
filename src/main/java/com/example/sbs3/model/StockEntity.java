package com.example.sbs3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "stock")
public class StockEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String symbol;
    private BigDecimal close;
    private String companyName;
    private String currency;
    private BigDecimal high;
    private BigInteger latestVolume;
    private BigDecimal low;
    private BigDecimal open;
    private BigInteger volume;

}

