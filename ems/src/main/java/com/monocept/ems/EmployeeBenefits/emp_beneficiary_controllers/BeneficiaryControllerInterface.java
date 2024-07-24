package com.monocept.ems.EmployeeBenefits.emp_beneficiary_controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.BeneficiaryDTO;


public interface BeneficiaryControllerInterface {

    ResponseEntity<String> createBeneficiary
        (@RequestBody BeneficiaryDTO beneficiaryDTO);

    ResponseEntity<BeneficiaryDTO> 
        getBeneficiaryByID(@RequestParam String id);

    ResponseEntity<List<BeneficiaryDTO>> 
        getAllBeneficiary();

    

    
}
