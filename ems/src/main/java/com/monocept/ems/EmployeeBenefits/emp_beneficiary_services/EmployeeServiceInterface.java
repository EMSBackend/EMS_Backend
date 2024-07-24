package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeDTO;

@Service
public interface EmployeeServiceInterface {
    public void createEmployee(EmployeeDTO employeeDTO);
    
    public EmployeeDTO getEmpById(String empId);

    public void updateEmployeeById(int empId,EmployeeDTO employeeDTO);

    public void deleteEmployeeById(int empId);

    public List<EmployeeDTO> getEmployeeList();
}