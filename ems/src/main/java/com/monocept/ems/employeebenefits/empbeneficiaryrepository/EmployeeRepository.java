package com.monocept.ems.employeebenefits.empbeneficiaryrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbeneficiaryentities.EmployeeModel;


public interface EmployeeRepository 
    extends JpaRepository<EmployeeModel, Integer>{
   
}
