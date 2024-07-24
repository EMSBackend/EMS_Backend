package com.monocept.ems.employee_benefits.emp_beneficiary_controllers.emp_beneficiary_controller_impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.employee_benefits.emp_beneficiary_controllers.EmployeeControllerInterface;
import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.EmployeeDTO;
import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.EmployeeRespectiveBenefitDTO;
import com.monocept.ems.employee_benefits.emp_beneficiary_services.impl.EmployeeRespectiveBenefitImpl;
import com.monocept.ems.employee_benefits.emp_beneficiary_services.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/beneficiary/emp")
@CrossOrigin(origins = "*")
public class EmployeeControllerImpl 
    implements EmployeeControllerInterface {
    
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    EmployeeRespectiveBenefitImpl employeeRespectiveBenefitImpl;


    @Override
    @GetMapping("/get-emp-details-by-id")
    public ResponseEntity<List<EmployeeDTO>> 
        getEmployeeById(@RequestParam String empId ){
            System.out.println("addEmployee() :: ");
        
            EmployeeDTO employeeDTO =  employeeServiceImpl.getEmpById(empId);

            List<EmployeeDTO> employeeDTOList = new ArrayList<>();

            if(employeeDTO == null){
                return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeDTOList);
            }

            System.out.println(
                "get-emp"+employeeDTO.getFirst_name()
            );
            
            employeeDTOList.add(employeeDTO);

            return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeDTOList);
    }

    
    
    @Override
    @GetMapping("/get-all-employee")
    public ResponseEntity<List<EmployeeDTO>> 
        getAllEmployee() {
        
        List<EmployeeDTO>  employeeDTOList 
            = employeeServiceImpl.getEmployeeList();
        
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(employeeDTOList);
    }


    @Override
    @GetMapping("/get-employee-respective-benefit")
    public ResponseEntity<List<EmployeeRespectiveBenefitDTO>> 
        getEmployeeRespectiveBenefit(@RequestParam String empId) {

        try{
           int id = Integer.parseInt(empId);
           
           List<EmployeeRespectiveBenefitDTO> resultList 
            =   employeeRespectiveBenefitImpl.getEmployeeRespectiveBenfitList(id);
        
            
            return ResponseEntity
            .status(HttpStatus.OK)
            .body(resultList);


        }catch(Exception e){
            System.out.println("getEmpRespectiveBenefit() :: Exception : "+e);
        }
        
        
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(new ArrayList<>());
    }
}
