package com.example.sbs3.service;

import com.example.sbs3.model.CompanyEntity;
import com.example.sbs3.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

private final RestTemplate restTemplate;
private final CompanyRepository companyRepository;

    @Value("${sandbox.host}")
    private CompanyEntity sandboxHost;

    @Value("${sandbox.token}")
    private CompanyEntity sandboxToken;


private final String SANDBOX_GET_LIST_COMPANY = sandboxHost + "stable/ref-data/symbols?token=" + sandboxToken;
    public List<CompanyEntity> getAllCompany() {
//        String url = "https://sandbox.iexapis.com/stable/ref-data/symbols?token=Tpk_ee567917a6b640bb8602834c9d30e571";

        try {
            List<CompanyEntity> listAllCompanyEntity = restTemplate.exchange(SANDBOX_GET_LIST_COMPANY,
                            HttpMethod.GET, null,
                            new ParameterizedTypeReference<List<CompanyEntity>>() {
                            })
                    .getBody();

            companyRepository.saveAll(listAllCompanyEntity);
            return listAllCompanyEntity;

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}

