package com.monocept.ems.employeebenefits.empbeneficiaryservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.BenefitsServiceInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsentities.BenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeRespectiveBenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsrepository.BenefitRepository;
import com.monocept.ems.employeebenefits.empbenefitsrepository.EmployeeRespectiveBenefitRepository;


@Service
public class BenefitsServiceImpl
    implements BenefitsServiceInterface{
   
    @Autowired
    BenefitRepository beneficiaryRepository;

    @Autowired
    EmployeeRespectiveBenefitRepository employeeBenefitRepository;

    
    @Override
    public List<BenefitDTO> getBenefits() {
        List<BenefitDTO> beneficiaryDTOList = new ArrayList<>();
        
        for(BenefitModel beneficiaryModel 
            : beneficiaryRepository.findAll()){
            beneficiaryDTOList.add(beneficiaryModel.tobeneficiaryDTO());
        }

        return beneficiaryDTOList;
    }


    

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
