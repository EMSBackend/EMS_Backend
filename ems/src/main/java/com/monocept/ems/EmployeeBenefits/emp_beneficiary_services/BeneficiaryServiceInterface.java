package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.BeneficiaryDTO;

@Service
public interface BeneficiaryServiceInterface{
    public boolean createBeneficiary(BeneficiaryDTO beneficiaryDTO);
    public BeneficiaryDTO getBeneficiaryById(String id);

    public boolean updateBeneficiaryById(int beneficiaryId, BeneficiaryDTO beneficiaryDTO);
    public boolean deleteBeneficiaryById(int beneficiaryId);

    public List<BeneficiaryDTO> getBeneficiaryList();

    
}