package com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos;

import java.sql.Date;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_entities.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
    private Integer employee_id;

    private String first_name;
    private String last_name;
    private String email;

    private String phone_number;

    private Date hire_date;

    private Date birth_date;

    private String gender;

    private String address;

    private String city;

    private String state;


    private String zip_code;

    private String country;

    private Integer department_id;

    private Integer position_id;

    private Integer manager_id;


    public EmployeeModel toEmployeeModel(){
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmployee_id(this.employee_id);
        employeeModel.setFirst_name(this.first_name);
        employeeModel.setLast_name(this.last_name);
        employeeModel.setEmail(this.email);
        employeeModel.setPhone_number(this.phone_number);
        employeeModel.setHire_date(this.hire_date);
        employeeModel.setBirth_date(this.birth_date);
        employeeModel.setGender(this.gender);
        employeeModel.setAddress(this.address);
        employeeModel.setCity(this.city);
        employeeModel.setState(this.state);
        employeeModel.setZip_code(this.zip_code);
        employeeModel.setCountry(this.country);
        employeeModel.setDepartment_id(this.department_id);
        employeeModel.setPosition_id(this.position_id);
        
        employeeModel.setManager_id(this.manager_id);
        

        return employeeModel;
    }
}
