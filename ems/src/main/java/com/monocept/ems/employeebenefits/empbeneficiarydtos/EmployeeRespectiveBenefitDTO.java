package com.monocept.ems.employeebenefits.empbeneficiarydtos;

import java.sql.Date;

import com.monocept.ems.employeebenefits.empbeneficiaryentities.EmployeeRespectiveBenefitModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeRespectiveBenefitDTO {
    private Integer employeeBenefitId;
    private Integer employeeId;
    private Integer benefitId;
    private Date startDate;
    private Date endDate;

    public EmployeeRespectiveBenefitModel toEmpRespectiveBenefitModel(){
        EmployeeRespectiveBenefitModel employeeRespectiveBenefitsModel
            = new EmployeeRespectiveBenefitModel();
        
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
}
