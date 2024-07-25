package com.monocept.ems.employeebenefits.empbenefitscontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeDTO;

public interface EmployeeControllerInterface {
    
    ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee();


    
}
