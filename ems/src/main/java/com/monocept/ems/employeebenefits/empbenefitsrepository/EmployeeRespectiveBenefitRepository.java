package com.monocept.ems.employeebenefits.empbenefitsrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeRespectiveBenefitModel;


public interface EmployeeRespectiveBenefitRepository 
    extends JpaRepository<EmployeeRespectiveBenefitModel, Integer>{
    
    List<EmployeeRespectiveBenefitModel> findByEmployeeId(Integer employeeId);

}
