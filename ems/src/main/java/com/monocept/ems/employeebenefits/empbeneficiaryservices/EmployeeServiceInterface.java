package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import com.monocept.ems.employeebenefits.empbeneficiarydtos.EmployeeDTO;

public interface EmployeeServiceInterface {
   
    public EmployeeDTO getEmpById(String empId);

    public List<EmployeeDTO> getEmployeeList();
}