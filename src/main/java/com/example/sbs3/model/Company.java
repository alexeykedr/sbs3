package com.example.sbs3.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity /*надо ли?*/
public class Company {

    private Long id;
    private String name;
    private String station;

    List<Company> listCompany = new ArrayList<>();



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
}
