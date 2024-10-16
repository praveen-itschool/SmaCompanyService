package com.nareshIt.raghu.service;

import java.util.List;

import com.nareshIt.raghu.entity.Company;

public interface ICompanyService {
	Long createCompany(Company cob);

	void updateCompany(Company cob);

	Company getOneCompany(Long id);

	List<Company> getAllCompanies();
}
