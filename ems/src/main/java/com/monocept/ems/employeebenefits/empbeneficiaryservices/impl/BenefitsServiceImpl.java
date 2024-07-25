package com.monocept.ems.employeebenefits.empbeneficiaryservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.BenefitsServiceInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsentities.BenefitModel;
import com.monocept.ems.employeebenefits.empbenefitsrepository.BenefitRepository;


@Service
public class BenefitsServiceImpl
    implements BenefitsServiceInterface{
   
    private static final Logger logger = 
        Logger.getLogger(BenefitsServiceImpl.class.getName());

    @Autowired
    BenefitRepository beneficiaryRepository;


    @Override
    public BenefitDTO getBenefitById(String id) {
        
        try{
            int beneficiaryId = Integer.parseInt(id);

            if(beneficiaryId != -1){
                BenefitModel beneficiaryModel
                     = beneficiaryRepository
                        .getReferenceById(beneficiaryId);
    
                return beneficiaryModel.tobeneficiaryDTO();
            }

        }catch(Exception e){
            logger.log(
                Level.SEVERE,
                "getBeneficiaryById() :: exception"+e);
        } 

        return null;
    }

    
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
    public void updateBenefitById(int empId, BenefitDTO benefitDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBenefitById'");
    }




}
