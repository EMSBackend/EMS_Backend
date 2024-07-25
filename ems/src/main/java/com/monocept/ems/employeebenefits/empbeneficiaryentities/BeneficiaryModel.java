package com.monocept.ems.employeebenefits.empbeneficiaryentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbeneficiarydtos.BenefitDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="benefits")
@Setter
@Getter
public class BeneficiaryModel {
    
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
