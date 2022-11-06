package com.example.sbs3.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="stocks_table")
public class Stock {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stocks_info")
    private String name;

    private String station;

    private String simbols;




}
