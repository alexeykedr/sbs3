
package com.example.sbs3.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "company")
public class CompanyEntity {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private String symbol;
    private String name;
    private String date;
    private String currency;
    private String figi;
    private BigInteger cik;



}


