package com.nareshIt.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshIt.raghu.entity.Company;
import com.nareshIt.raghu.service.ICompanyService;

@RestController
@RequestMapping("/company")
public class CompanyRestController {

    @Autowired
    private ICompanyService service;

    @PostMapping("/create")
    public ResponseEntity<String> createCompany(@RequestBody Company company) {
        ResponseEntity<String> response;
        try {
            Long id = service.createCompany(company);
            response = ResponseEntity.ok("Created with ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            response = ResponseEntity.status(500).body("Error occurred while creating the company.");
        }
        return response;
    }
}
