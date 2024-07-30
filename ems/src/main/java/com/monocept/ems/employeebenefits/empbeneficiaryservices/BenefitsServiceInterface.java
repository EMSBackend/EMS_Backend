package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;

public interface BenefitsServiceInterface{

    public List<BenefitDTO> getBenefits();

    public List<BenefitDTO> 
    getEmpBenefitList(int empId);

    
}