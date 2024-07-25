package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;

public interface BenefitsServiceInterface{
    public BenefitDTO getBenefitById(String id);

    public void 
        updateBenefitById(int empId, BenefitDTO benefitDTO);

    public List<BenefitDTO> getBenefits();

    
}