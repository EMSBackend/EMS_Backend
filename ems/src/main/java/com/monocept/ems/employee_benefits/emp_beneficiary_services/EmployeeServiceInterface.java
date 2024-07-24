package com.monocept.ems.employee_benefits.emp_beneficiary_services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.EmployeeDTO;

@Service
public interface EmployeeServiceInterface {
   
    public EmployeeDTO getEmpById(String empId);

    public List<EmployeeDTO> getEmployeeList();
}