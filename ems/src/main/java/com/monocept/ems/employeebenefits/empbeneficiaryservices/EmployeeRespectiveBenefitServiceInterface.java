package com.monocept.ems.employeebenefits.empbeneficiaryservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiarydtos.EmployeeRespectiveBenefitDTO;


@Service
public interface EmployeeRespectiveBenefitServiceInterface {
    public List<EmployeeRespectiveBenefitDTO> 
    getEmployeeRespectiveBenfitList(int empId);
}
