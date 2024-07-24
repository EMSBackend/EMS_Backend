package com.monocept.ems.employee_benefits.emp_beneficiary_services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.BenefitDTO;

@Service
public interface BenefitServiceInterface{
    public BenefitDTO getBenefitById(String id);

    public boolean 
        updateBenefitById(int empId, BenefitDTO benefitDTO);

    public List<BenefitDTO> getAllBenefitList();

    
}