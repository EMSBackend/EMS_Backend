package com.monocept.ems.employeebenefits.empbeneficiaryservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.EmployeeRespectiveBenefitServiceInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeRespectiveBenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsrepository.EmployeeRespectiveBenefitRepository;

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
