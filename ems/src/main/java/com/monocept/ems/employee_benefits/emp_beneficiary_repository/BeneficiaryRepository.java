package com.monocept.ems.employee_benefits.emp_beneficiary_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.ems.employee_benefits.emp_beneficiary_entities.BeneficiaryModel;


public interface BeneficiaryRepository
    extends JpaRepository<BeneficiaryModel, Integer> {

}
