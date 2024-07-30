package com.monocept.ems.employeebenefits.empbenefitsrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbenefitsentities.BenefitModel;



public interface BenefitRepository
    extends JpaRepository<BenefitModel, Integer> {
    
    List<BenefitModel> findByBeneficiaryId(Integer beneficiaryId);
}
