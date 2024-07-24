package com.monocept.ems.employee_benefits.emp_beneficiary_controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.EmployeeDTO;
import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.EmployeeRespectiveBenefitDTO;

public interface EmployeeControllerInterface {
    
    ResponseEntity<List<EmployeeDTO>> 
        getEmployeeById(@RequestParam String empId );
    
    ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee();

    ResponseEntity<List<EmployeeRespectiveBenefitDTO>> 
        getEmployeeRespectiveBenefit(@RequestParam String empId);

     

    
}
