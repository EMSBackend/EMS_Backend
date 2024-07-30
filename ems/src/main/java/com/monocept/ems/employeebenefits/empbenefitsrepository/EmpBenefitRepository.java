package com.monocept.ems.employeebenefits.empbenefitsrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbenefitsentities.EmpBenefitModel;


public interface EmpBenefitRepository 
    extends JpaRepository<EmpBenefitModel, Integer>{
    
    List<EmpBenefitModel> findByEmployeeId(Integer employeeId);

}
