package com.monocept.ems.employeebenefits.empbenefitsdtos;

import java.sql.Date;

import com.monocept.ems.employeebenefits.empbenefitsentities.EmpBenefitModel;

public class EmpBenefitDTO {
    private Integer employeeBenefitId;
    private Integer employeeId;
    private Integer benefitId;
    private Date startDate;
    private Date endDate;

    public EmpBenefitModel toEmpRespectiveBenefitModel(){
        EmpBenefitModel employeeRespectiveBenefitsModel
            = new EmpBenefitModel();
        
        employeeRespectiveBenefitsModel
            .setEmployeeBenefitId(this.employeeBenefitId);
        
        employeeRespectiveBenefitsModel
            .setBenefitId(this.benefitId);

        employeeRespectiveBenefitsModel
            .setEmployeeId(this.employeeId);

        employeeRespectiveBenefitsModel
            .setStartDate(this.startDate);

        employeeRespectiveBenefitsModel
            .setEndDate(this.endDate);

        return employeeRespectiveBenefitsModel;
    }

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
}
