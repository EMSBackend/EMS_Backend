package com.monocept.ems.employeebenefits.empbenefitsentities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmpBenefitDTO;

@Entity
@Table(name = "employee_benefits")

public class EmpBenefitModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_benefit_id")
    private Integer employeeBenefitId;

    @Column(name = "employee_id")
    private Integer employeeId;

    
    @Column(name = "benefit_id")
    private Integer benefitId;

    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;




    public Integer getEmployeeBenefitId() {
        return employeeBenefitId;
    }


    public void setEmployeeBenefitId(Integer employeeBenefitId) {
        this.employeeBenefitId = employeeBenefitId;
    }


    public Integer getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }


    public Integer getBenefitId() {
        return benefitId;
    }


    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }


    public Date getStartDate() {
        return startDate;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date getEndDate() {
        return endDate;
    }


    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    public EmpBenefitDTO toEmpRespectiveBenefitModel(){
        EmpBenefitDTO employeeRespectiveBenefitDTO
            = new EmpBenefitDTO();
        
        employeeRespectiveBenefitDTO
            .setEmployeeBenefitId(this.employeeBenefitId);
        
            employeeRespectiveBenefitDTO
            .setBenefitId(this.benefitId);

            employeeRespectiveBenefitDTO
            .setEmployeeId(this.employeeId);

            employeeRespectiveBenefitDTO
            .setStartDate(this.startDate);

            employeeRespectiveBenefitDTO
            .setEndDate(this.endDate);

        return employeeRespectiveBenefitDTO;
    }
}
