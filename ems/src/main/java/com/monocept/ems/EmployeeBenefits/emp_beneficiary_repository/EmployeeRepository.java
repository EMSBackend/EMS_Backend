package com.monocept.ems.EmployeeBenefits.emp_beneficiary_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_entities.EmployeeModel;


public interface EmployeeRepository 
    extends JpaRepository<EmployeeModel, Integer>{
   
}
