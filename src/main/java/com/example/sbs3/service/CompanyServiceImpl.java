package com.example.sbs3.service;

import com.example.sbs3.dto.CompanyDto;
import com.example.sbs3.model.CompanyEntity;
import com.example.sbs3.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final RestTemplate restTemplate;
    private final CompanyRepository companyRepository;

    @Value("${company.host}")
    private CompanyEntity companyHost;

    @Value("${company.token}")
    private CompanyEntity companyToken;

    private final String SANDBOX_GET_LIST_COMPANY = companyHost + "/v1/data/CORE/COMPANY?last=1&token=" + companyToken;
//         "https://cloud.iexapis.com/v1/data/CORE/COMPANY?last=1&token=sk_03d409871b154d1a8d94265f3fae0239"

    public List<CompanyEntity> getAllCompany() {

        try {
            List<com.example.sbs3.dto.CompanyDto> listAllCompanyDtos = restTemplate.exchange(SANDBOX_GET_LIST_COMPANY,
                            HttpMethod.GET, null,
                            new ParameterizedTypeReference<List<CompanyDto>>() {
                            })
                    .getBody();

            if (CollectionUtils.isEmpty(listAllCompanyDtos)) {
                log.debug("In getAllCompany() - result list is empty or null");
                return Collections.emptyList();
            }

            List<CompanyEntity> entities = listAllCompanyDtos
                    .stream()
                    .map(CompanyDto::toEntity)
                    .collect(Collectors.toList());

            log.debug("In getAllCompany() - saved {} entities", entities.size());

            return companyRepository.saveAll(entities);


        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}

