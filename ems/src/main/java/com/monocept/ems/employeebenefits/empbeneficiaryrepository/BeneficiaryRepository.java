package com.monocept.ems.employeebenefits.empbeneficiaryrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employeebenefits.empbeneficiaryentities.BeneficiaryModel;


public interface BeneficiaryRepository
    extends JpaRepository<BeneficiaryModel, Integer> {

}
