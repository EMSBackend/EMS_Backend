package com.monocept.ems.employeebenefits.empbenefitscontrollers.empbenefitscontrollerimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.impl.EmployeeServiceImpl;
import com.monocept.ems.employeebenefits.empbenefitscontrollers.EmployeeControllerInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeDTO;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeControllerImpl 
    implements EmployeeControllerInterface {
    
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @Override
    @GetMapping("/")
    public ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee() {
        
        List<EmployeeDTO>  employeeDTOList 
            = employeeServiceImpl.getEmployeeList();
        
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(employeeDTOList);
    }


}
