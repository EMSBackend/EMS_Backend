package com.monocept.ems.employeebenefits.empbeneficiaryservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.BenefitsServiceInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmpBenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsentities.BenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsentities.EmpBenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsrepository.BenefitRepository;
import com.monocept.ems.employeebenefits.empbenefitsrepository.EmpBenefitRepository;


@Service
public class BenefitsServiceImpl
    implements BenefitsServiceInterface{
   
    @Autowired
    BenefitRepository benefitRepository;

    @Autowired
    EmpBenefitRepository empBenefitRepository;

    
    @Override
    public List<BenefitDTO> getBenefits() {
        List<BenefitDTO> benefitDTOList = new ArrayList<>();
        
        for(BenefitModel benefitModel 
            : benefitRepository.findAll()){
            benefitDTOList.add(benefitModel.tobenefitDTO());
        }

        return benefitDTOList;
    }


    

    @Override
    public List<BenefitDTO>
    getEmpBenefitList(int empId) {
        List<BenefitDTO> empBenefitDTOList 
            = new ArrayList<>();
        
        for(BenefitModel empBenefitModel 
                : benefitRepository.findByBeneficiaryId(empId)){
                
                empBenefitDTOList
                    .add(
                        empBenefitModel
                        .tobenefitDTO());
        }

        return empBenefitDTOList;
        
    }


    




}
