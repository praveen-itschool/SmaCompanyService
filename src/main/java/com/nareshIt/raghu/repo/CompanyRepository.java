package com.nareshIt.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshIt.raghu.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
