
package com.monocept.ems.employeebenefits.empbeneficiaryentities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbeneficiarydtos.EmployeeDTO;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="employees")
@Getter
@Setter


public class EmployeeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    // @NonNull
    @Column(name="first_name")
    private String first_name;
    
    @Column(name="last_name")
    private String last_name;

    
    @Column(name="email")
    private String email;
    

    // @NonNull
    @Column(name="phone_number")
    private String phone_number;

    
    // @NonNull
    @Column(name="hire_date")
    private Date hire_date;
    
    // @NonNull
    @Column(name="birth_date")
    private Date birth_date;

    // @NonNull
    @Column(name="gender")
    private String gender;

    // @NonNull
    @Column(name="address")
    private String address;


    
    // @NonNull
    @Column(name="city")
    private String city;

    // @NonNull
    @Column(name="state")
    private String state;

    // @NonNull
    @Column(name="zip_code")
    private String zip_code;


    // @NonNull
    @Column(name="country")
    private String country;

    // @NonNull
    @Column(name="department_id")
    private Integer department_id;

    // @NonNull
    @Column(name="position_id")
    private Integer position_id;

    // @NonNull
    @Column(name="manager_id")
    private Integer manager_id;


    public EmployeeDTO toEmployeeDTO(){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployee_id(this.employee_id);
        employeeDTO.setFirst_name(this.first_name);
        employeeDTO.setLast_name(this.last_name);
        employeeDTO.setEmail(this.email);
        employeeDTO.setPhone_number(this.phone_number);
        employeeDTO.setHire_date(this.hire_date);
        employeeDTO.setBirth_date(this.birth_date);
        employeeDTO.setGender(this.gender);
        employeeDTO.setAddress(this.address);
        employeeDTO.setCity(this.city);
        employeeDTO.setState(this.state);
        employeeDTO.setZip_code(this.zip_code);
        employeeDTO.setCountry(this.country);
        employeeDTO.setDepartment_id(this.department_id);
        employeeDTO.setPosition_id(this.position_id);
        employeeDTO.setManager_id(this.manager_id);
        

        return employeeDTO;
    }

}

