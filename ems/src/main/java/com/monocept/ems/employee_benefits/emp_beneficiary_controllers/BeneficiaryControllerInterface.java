package com.monocept.ems.employee_benefits.emp_beneficiary_controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.BenefitDTO;


public interface BeneficiaryControllerInterface {

    ResponseEntity<BenefitDTO> 
        getBenefitByID(@RequestParam String id);

    ResponseEntity<List<BenefitDTO>> 
        getAllBenefit();

    

    
}
