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
    private Integer benefit_id = 0;

    // @Nonnull
    @Column(name="benefit_name")
    private String benefit_name = "";

    
    // @Nonnull
    @Column(name="description")
    private String description = "";

    
    // @Nonnull
    @Column(name="start_date")
    private String start_date = "";

    
    // @Nonnull
    @Column(name="end_date")
    private String end_date = "";

    
    // @Nonnull
    @Column(name="beneficiary_id")
    private Integer beneficiary_id = 0;

    
    // @Nonnull
    @Column(name="beneficiary_cost")
    private Integer beneficiary_cost = 0;


    // @Nonnull
    @Column(name="beneficiary_desc")
    private String beneficiary_desc = "";

    
    // @Nonnull
    @Column(name="beneficiary_duration_months")
    private Integer beneficiary_duration_months = 0;

    // @Nonnull
    @Column(name="beneficiary_name")
    private String beneficiary_name = "";
    


    

    public Integer getBenefit_id() {
        return benefit_id;
    }




    public void setBenefit_id(Integer benefit_id) {
        this.benefit_id = benefit_id;
    }




    public String getBenefit_name() {
        return benefit_name;
    }




    public void setBenefit_name(String benefit_name) {
        this.benefit_name = benefit_name;
    }




    public String getDescription() {
        return description;
    }




    public void setDescription(String description) {
        this.description = description;
    }




    public String getStart_date() {
        return start_date;
    }




    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }




    public String getEnd_date() {
        return end_date;
    }




    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }




    public Integer getBeneficiary_id() {
        return beneficiary_id;
    }




    public void setBeneficiary_id(Integer beneficiary_id) {
        this.beneficiary_id = beneficiary_id;
    }




    public Integer getBeneficiary_cost() {
        return beneficiary_cost;
    }




    public void setBeneficiary_cost(Integer beneficiary_cost) {
        this.beneficiary_cost = beneficiary_cost;
    }




    public String getBeneficiary_desc() {
        return beneficiary_desc;
    }




    public void setBeneficiary_desc(String beneficiary_desc) {
        this.beneficiary_desc = beneficiary_desc;
    }




    public Integer getBeneficiary_duration_months() {
        return beneficiary_duration_months;
    }




    public void setBeneficiary_duration_months(Integer beneficiary_duration_months) {
        this.beneficiary_duration_months = beneficiary_duration_months;
    }




    public String getBeneficiary_name() {
        return beneficiary_name;
    }




    public void setBeneficiary_name(String beneficiary_name) {
        this.beneficiary_name = beneficiary_name;
    }


    
    public BenefitDTO tobeneficiaryDTO(){
        BenefitDTO beneficiaryDTO = new BenefitDTO();
        beneficiaryDTO.setBenefit_id(this.benefit_id);
        
        beneficiaryDTO.setBenefit_name(this.benefit_name);
        beneficiaryDTO.setDescription(this.description);
        beneficiaryDTO.setStart_date(this.start_date);
        beneficiaryDTO.setEnd_date(this.end_date);
        
        beneficiaryDTO.setBeneficiary_id(this.beneficiary_id);
        beneficiaryDTO.setBeneficiary_cost(this.beneficiary_cost);
        beneficiaryDTO.setBeneficiary_desc(this.beneficiary_desc);
        beneficiaryDTO.setBeneficiary_duration_months(this.beneficiary_duration_months);
        beneficiaryDTO.setBeneficiary_name(this.beneficiary_name);

        return beneficiaryDTO;
    }



    
}
