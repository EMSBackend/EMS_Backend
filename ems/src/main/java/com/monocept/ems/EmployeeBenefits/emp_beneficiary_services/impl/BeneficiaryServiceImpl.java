package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.BeneficiaryDTO;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_entities.BeneficiaryModel;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_repository.BeneficiaryRepository;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.BeneficiaryServiceInterface;

@Service
public class BeneficiaryServiceImpl
    implements BeneficiaryServiceInterface{
   
    @Autowired
    BeneficiaryRepository beneficiaryRepository;

    @Override
    public boolean createBeneficiary(BeneficiaryDTO beneficiaryDTO) {
        try{
            beneficiaryRepository.save(beneficiaryDTO.toBeneficiaryModel());
            return true;
        }catch(Exception e){
            System.out.println("createBeneficiary() :: exception "+e);
        }
        return false;
    }

    @Override
    public BeneficiaryDTO getBeneficiaryById(String id) {
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
    public List<BeneficiaryDTO> getBeneficiaryList() {
        List<BeneficiaryDTO> beneficiaryDTOList = new ArrayList<>();
        
        for(BeneficiaryModel beneficiaryModel 
            : beneficiaryRepository.findAll()){
           
                // System.out.println("beneficiary item :: "+beneficiaryModel.getBenefit_name());
                beneficiaryDTOList.add(beneficiaryModel.tobeneficiaryDTO());
        }

        return beneficiaryDTOList;
    }

    @Override
    public boolean updateBeneficiaryById(int beneficiaryId, BeneficiaryDTO beneficiaryDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBeneficiaryById'");
    }

    @Override
    public boolean deleteBeneficiaryById(int beneficiaryId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBeneficiaryById'");
    }


}
