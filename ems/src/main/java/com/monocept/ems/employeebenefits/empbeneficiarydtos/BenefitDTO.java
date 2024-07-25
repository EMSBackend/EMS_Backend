package com.monocept.ems.employeebenefits.empbeneficiarydtos;

import com.monocept.ems.employeebenefits.empbeneficiaryentities.BeneficiaryModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    

    public BeneficiaryModel toBeneficiaryModel(){
        BeneficiaryModel beneficiaryModel = new BeneficiaryModel();
        beneficiaryModel.setBenefit_id(this.benefit_id);
        
        beneficiaryModel.setBenefit_name(this.benefit_name);
        beneficiaryModel.setDescription(this.description);
        beneficiaryModel.setStart_date(this.start_date);
        beneficiaryModel.setEnd_date(this.end_date);

        
        beneficiaryModel.setBeneficiary_id(this.beneficiary_id);
        beneficiaryModel.setBeneficiary_cost(this.beneficiary_cost);
        beneficiaryModel.setBeneficiary_desc(this.beneficiary_desc);
        beneficiaryModel.setBeneficiary_duration_months(this.beneficiary_duration_months);
        beneficiaryModel.setBeneficiary_name(this.beneficiary_name);


        return beneficiaryModel;
    }
}
