package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;

public interface BenefitsServiceInterface{

    public List<BenefitDTO> getBenefits();

    public List<EmployeeRespectiveBenefitDTO> 
    getEmployeeRespectiveBenfitList(int empId);

    
}