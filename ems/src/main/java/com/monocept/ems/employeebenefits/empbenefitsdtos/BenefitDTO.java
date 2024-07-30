package com.monocept.ems.employeebenefits.empbenefitsdtos;

import com.monocept.ems.employeebenefits.empbenefitsentities.BenefitModel;



public class BenefitDTO {

    private Integer benefit_id;

    private String benefit_name;

    private String description;

    private String start_date;
    
    private String end_date;

    
    private Integer beneficiary_id;

    
    private Integer beneficiary_cost;


    private String beneficiary_desc;

    
    private Integer beneficiary_duration_months;

    private String beneficiary_name;
    


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


    
    public BenefitModel toBeneficiaryModel(){
        BenefitModel beneficiaryModel = new BenefitModel();
        beneficiaryModel.setBenefitId(this.benefit_id);
        
        beneficiaryModel.setBenefitName(this.benefit_name);
        beneficiaryModel.setDescription(this.description);
        beneficiaryModel.setStartDate(this.start_date);
        beneficiaryModel.setEndDate(this.end_date);

        
        beneficiaryModel.setBeneficiaryId(this.beneficiary_id);
        beneficiaryModel.setBeneficiaryCost(this.beneficiary_cost);
        beneficiaryModel.setBeneficiaryDesc(this.beneficiary_desc);
        beneficiaryModel.setBeneficiaryDurationMonths(this.beneficiary_duration_months);
        beneficiaryModel.setBeneficiaryName(this.beneficiary_name);


        return beneficiaryModel;
    }

}
