package com.ssafy.jobtender.dao;

import com.ssafy.jobtender.dto.output.CompanyRatingOutDTO;
import com.ssafy.jobtender.entity.Company;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CompanyDAO {
    CompanyRatingOutDTO readCompanies(long companyId);
    List<Company> readCompaniesByInputId(long inputId);
}