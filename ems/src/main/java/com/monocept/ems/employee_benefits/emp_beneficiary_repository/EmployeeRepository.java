package com.monocept.ems.employee_benefits.emp_beneficiary_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employee_benefits.emp_beneficiary_entities.EmployeeModel;


public interface EmployeeRepository 
    extends JpaRepository<EmployeeModel, Integer>{
   
}
