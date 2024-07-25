package com.monocept.ems.employeebenefits.empbenefitscontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;


public interface BenefitsControllerInterface {

    ResponseEntity<BenefitDTO> 
        getBenefitByID(@PathVariable String id);

    ResponseEntity<List<BenefitDTO>> 
        getBenefits();

    

    
}
