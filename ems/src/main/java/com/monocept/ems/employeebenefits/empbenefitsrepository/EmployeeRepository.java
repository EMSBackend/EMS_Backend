package com.monocept.ems.employeebenefits.empbenefitsrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeModel;


public interface EmployeeRepository 
    extends JpaRepository<EmployeeModel, Integer>{
   
}
