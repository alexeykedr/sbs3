package com.example.sbs3.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class Company {

    private String symbol;
    private String companyName;
    private String exchange;
    private String industry;
    private String website;
    private String description;
    private String CEO;
    private String securityName;
    private String issueType;
    private String sector;
    private int primarySicCode;
    private int employees;
    private String[] tags;
    private String address;
    private String address2;
    private String state;
    private String city;
    private String zip;
    private String country;
    private String phone;
}


    // Пройдите по каждой компании, которая включена,
    // и поместите запрос в очередь, чтобы эта компания могла получить свои данные.

   /*
   companies
    .stream()
    .filter(Company:getOn)
    .forEach(company -> queue.add(company))

--or--
   companies.forEach(company -> queue.add(company)) - компании в очередь,

   для тредов нужен экзекьютор
   */

//GET /stock/{symbol}/company

/*{
"symbol":"-H",
"exchange":"XNYS",
"exchangeSuffix":"",
"exchangeName":" kowh rtgxkcnIc Nne ecoSYEa",
"exchangeSegment":"SNYX",
"exchangeSegmentName":"Yx hogknr onc ewIta eckNEcS",
"name":"5n25nEt-EiEi a2NrDc2U  91d.lnS0 IRTPea/u/l  aF.9060Mi5 %nc D",
"date":"2022-11-11",
"type":"ps","iexId":null,
"region":"US"
,"currency":"USD",
"isEnabled":true,
"figi":"9G1DBB04QY42",
"cik":"1143267",
"lei":"5E5RR8CN7EBRSPR4H5FO"
}
*/
