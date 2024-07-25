package com.monocept.ems.employeebenefits.empbenefitsentities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee_benefits")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeRespectiveBenefitModel {
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


    public EmployeeRespectiveBenefitDTO toEmpRespectiveBenefitModel(){
        EmployeeRespectiveBenefitDTO employeeRespectiveBenefitDTO
            = new EmployeeRespectiveBenefitDTO();
        
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
