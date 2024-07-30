package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmpBenefitDTO;


@Service
public interface EmployeeRespectiveBenefitServiceInterface {
    public List<EmpBenefitDTO> 
    getEmployeeRespectiveBenfitList(int empId);
}
