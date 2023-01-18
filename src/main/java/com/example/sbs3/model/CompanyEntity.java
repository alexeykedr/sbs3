
package com.example.sbs3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "company")
public class CompanyEntity {

    // поля в бд
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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


}


