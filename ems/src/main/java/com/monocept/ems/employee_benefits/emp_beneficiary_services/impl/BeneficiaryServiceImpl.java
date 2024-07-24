package com.monocept.ems.employee_benefits.emp_beneficiary_services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employee_benefits.emp_beneficiary_dtos.BenefitDTO;
import com.monocept.ems.employee_benefits.emp_beneficiary_entities.BeneficiaryModel;
import com.monocept.ems.employee_benefits.emp_beneficiary_repository.BeneficiaryRepository;
import com.monocept.ems.employee_benefits.emp_beneficiary_services.BenefitServiceInterface;

@Service
public class BeneficiaryServiceImpl
    implements BenefitServiceInterface{
   
    @Autowired
    BeneficiaryRepository beneficiaryRepository;


    @Override
    public BenefitDTO getBenefitById(String id) {
        int beneficiaryId = -1;
        try{
            beneficiaryId = Integer.parseInt(id);

            if(beneficiaryId != -1){
                BeneficiaryModel beneficiaryModel
                     = beneficiaryRepository
                        .getReferenceById(beneficiaryId);
    
                return beneficiaryModel.tobeneficiaryDTO();
            }

        }catch(Exception e){
            System.out.println("getBeneficiaryById() :: exception"+e);
        } 

        return null;
    }

    
    @Override
    public List<BenefitDTO> getAllBenefitList() {
        List<BenefitDTO> beneficiaryDTOList = new ArrayList<>();
        
        for(BeneficiaryModel beneficiaryModel 
            : beneficiaryRepository.findAll()){
           
                // System.out.println("beneficiary item :: "+beneficiaryModel.getBenefit_name());
                beneficiaryDTOList.add(beneficiaryModel.tobeneficiaryDTO());
        }

        return beneficiaryDTOList;
    }

    @Override
    public boolean updateBenefitById(int beneficiaryId, BenefitDTO beneficiaryDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBeneficiaryById'");
    }



}
