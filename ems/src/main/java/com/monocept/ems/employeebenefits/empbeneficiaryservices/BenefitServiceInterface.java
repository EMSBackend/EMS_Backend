package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import com.monocept.ems.employeebenefits.empbeneficiarydtos.BenefitDTO;

public interface BenefitServiceInterface{
    public BenefitDTO getBenefitById(String id);

    public boolean 
        updateBenefitById(int empId, BenefitDTO benefitDTO);

    public List<BenefitDTO> getAllBenefitList();

    
}