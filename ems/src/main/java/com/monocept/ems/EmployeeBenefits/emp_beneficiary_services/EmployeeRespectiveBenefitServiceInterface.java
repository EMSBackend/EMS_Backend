package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeRespectiveBenefitDTO;


@Service
public interface EmployeeRespectiveBenefitServiceInterface {
    public List<EmployeeRespectiveBenefitDTO> 
    getEmployeeRespectiveBenfitList(int empId);
}
