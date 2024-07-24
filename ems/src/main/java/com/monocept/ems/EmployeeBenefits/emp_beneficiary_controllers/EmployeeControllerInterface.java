package com.monocept.ems.EmployeeBenefits.emp_beneficiary_controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeDTO;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeRespectiveBenefitDTO;

public interface EmployeeControllerInterface {
    
    ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employeeDTO);
    ResponseEntity<List<EmployeeDTO>> getEmployeeById(@RequestParam String empId );
    ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee();

    ResponseEntity<List<EmployeeRespectiveBenefitDTO>> 
        getEmployeeRespectiveBenefit(@RequestParam String empId);

     

    
}
