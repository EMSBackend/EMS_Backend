package com.monocept.ems.employeebenefits.empbenefitsentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;


@Entity
@Table(name="benefits")
public class BenefitModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer benefitId = 0;

    // @Nonnull
    @Column(name="benefit_name")
    private String benefitName = "";

    
    // @Nonnull
    @Column(name="description")
    private String description = "";

    
    // @Nonnull
    @Column(name="start_date")
    private String startDate = "";

    
    // @Nonnull
    @Column(name="end_date")
    private String endDate = "";

    
    // @Nonnull
    @Column(name="beneficiary_id")
    private Integer beneficiaryId = 0;

    
    // @Nonnull
    @Column(name="beneficiary_cost")
    private Integer beneficiaryCost = 0;


    // @Nonnull
    @Column(name="beneficiary_desc")
    private String beneficiaryDesc = "";

    
    // @Nonnull
    @Column(name="beneficiary_duration_months")
    private Integer beneficiaryDurationMonths = 0;

    // @Nonnull
    @Column(name="beneficiary_name")
    private String beneficiaryName = "";
    


    

    public Integer getBenefitId() {
        return benefitId;
    }




    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }




    public String getBenefitName() {
        return benefitName;
    }




    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }




    public String getDescription() {
        return description;
    }




    public void setDescription(String description) {
        this.description = description;
    }




    public String getStartDate() {
        return startDate;
    }




    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }




    public String getEndDate() {
        return endDate;
    }




    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }




    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }




    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }




    public Integer getBeneficiaryCost() {
        return beneficiaryCost;
    }




    public void setBeneficiaryCost(Integer beneficiaryCost) {
        this.beneficiaryCost = beneficiaryCost;
    }




    public String getBeneficiaryDesc() {
        return beneficiaryDesc;
    }




    public void setBeneficiaryDesc(String beneficiaryDesc) {
        this.beneficiaryDesc = beneficiaryDesc;
    }




    public Integer getBeneficiaryDurationMonths() {
        return beneficiaryDurationMonths;
    }




    public void setBeneficiaryDurationMonths(Integer beneficiaryDurationMonths) {
        this.beneficiaryDurationMonths = beneficiaryDurationMonths;
    }




    public String getBeneficiaryName() {
        return beneficiaryName;
    }




    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }


    
    public BenefitDTO tobenefitDTO(){
        BenefitDTO beneficiaryDTO = new BenefitDTO();
        beneficiaryDTO.setBenefit_id(this.benefitId);
        
        beneficiaryDTO.setBenefit_name(this.benefitName);
        beneficiaryDTO.setDescription(this.description);
        beneficiaryDTO.setStart_date(this.startDate);
        beneficiaryDTO.setEnd_date(this.endDate);
        
        beneficiaryDTO.setBeneficiary_id(this.beneficiaryId);
        beneficiaryDTO.setBeneficiary_cost(this.beneficiaryCost);
        beneficiaryDTO.setBeneficiary_desc(this.beneficiaryDesc);
        beneficiaryDTO
            .setBeneficiary_duration_months(
                this.beneficiaryDurationMonths);
                
        beneficiaryDTO.setBeneficiary_name(this.beneficiaryName);

        return beneficiaryDTO;
    }



    
}
