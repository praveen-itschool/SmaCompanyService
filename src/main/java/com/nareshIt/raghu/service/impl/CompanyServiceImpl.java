package com.nareshIt.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshIt.raghu.entity.Company;
import com.nareshIt.raghu.repo.CompanyRepository;
import com.nareshIt.raghu.service.ICompanyService;

@Service
public class CompanyServiceImpl implements ICompanyService {
	@Autowired
	private CompanyRepository repo;

	@Override
	public Long createCompany(Company cob) {
		Company save = repo.save(cob);
		return save.getId();
	}

	@Override
	public void updateCompany(Company cob) {
		if (cob.getId() != null && repo.existsById(cob.getId())) {
			repo.save(cob);
		}

	}

	@Override
	public Company getOneCompany(Long id) {
		Optional<Company> opt = repo.findById(id);
		if (opt.isPresent()) {
			return null;
		}
		return opt.get();
	}

	@Override
	public List<Company> getAllCompanies() {
		List<Company> list = repo.findAll();
		return list;
	}

}
