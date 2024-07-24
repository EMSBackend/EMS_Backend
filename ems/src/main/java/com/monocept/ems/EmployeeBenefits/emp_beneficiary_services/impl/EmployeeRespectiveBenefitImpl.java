package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeRespectiveBenefitDTO;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_entities.EmployeeRespectiveBenefitModel;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_repository.EmployeeRespectiveBenefitRepository;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.EmployeeRespectiveBenefitServiceInterface;

@Service
public class EmployeeRespectiveBenefitImpl
    implements EmployeeRespectiveBenefitServiceInterface {

    @Autowired
    EmployeeRespectiveBenefitRepository employeeBenefitRepository;

    @Override
    public List<EmployeeRespectiveBenefitDTO> 
    getEmployeeRespectiveBenfitList(int empId) {
        List<EmployeeRespectiveBenefitDTO> employeeRespectiveBenefitDTOList 
            = new ArrayList<>();
        
        for(EmployeeRespectiveBenefitModel employeeRespectiveBenefitModel 
                : employeeBenefitRepository.findByEmployeeId(empId)){
                
                employeeRespectiveBenefitDTOList
                    .add(
                        employeeRespectiveBenefitModel
                        .toEmpRespectiveBenefitModel());
        }

        return employeeRespectiveBenefitDTOList;
        
    }

}
