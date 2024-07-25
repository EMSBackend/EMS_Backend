package com.monocept.ems.employeebenefits.empbeneficiaryrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbeneficiaryentities.EmployeeRespectiveBenefitModel;


public interface EmployeeRespectiveBenefitRepository 
    extends JpaRepository<EmployeeRespectiveBenefitModel, Integer>{
    
    List<EmployeeRespectiveBenefitModel> findByEmployeeId(Integer employeeId);

}
