package com.example.sbs3.repository;

import com.example.sbs3.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity,String> {

}
