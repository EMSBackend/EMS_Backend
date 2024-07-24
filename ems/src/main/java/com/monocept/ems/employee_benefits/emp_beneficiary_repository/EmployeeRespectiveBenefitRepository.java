package com.monocept.ems.employee_benefits.emp_beneficiary_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employee_benefits.emp_beneficiary_entities.EmployeeRespectiveBenefitModel;


public interface EmployeeRespectiveBenefitRepository 
    extends JpaRepository<EmployeeRespectiveBenefitModel, Integer>{
    
    List<EmployeeRespectiveBenefitModel> findByEmployeeId(Integer employeeId);

}
