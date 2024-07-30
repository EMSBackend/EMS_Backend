package com.monocept.ems.employeebenefits.empbenefitscontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;


public interface BenefitsControllerInterface {

    ResponseEntity<List<BenefitDTO>> 
        getBenefits();

    
    ResponseEntity<List<BenefitDTO>> 
        getEmpBenefit(@RequestParam String empId);

     

    
}
