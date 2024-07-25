package com.monocept.ems.employeebenefits.empbenefitscontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeDTO;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;

public interface EmployeeControllerInterface {
    
    ResponseEntity<List<EmployeeDTO>> 
        getEmployeeById(@RequestParam String empId );
    
    ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee();

    ResponseEntity<List<EmployeeRespectiveBenefitDTO>> 
        getEmployeeRespectiveBenefit(@RequestParam String empId);

     

    
}
