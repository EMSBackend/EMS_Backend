
package com.monocept.ems.employeebenefits.empbenefitsentities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeDTO;


@Entity
@Table(name="employees")


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




    public Integer getEmployee_id() {
        return employee_id;
    }


    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }


    public String getFirst_name() {
        return first_name;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }


    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone_number() {
        return phone_number;
    }


    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public Date getHire_date() {
        return hire_date;
    }


    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }


    public Date getBirth_date() {
        return birth_date;
    }


    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public String getZip_code() {
        return zip_code;
    }


    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public Integer getDepartment_id() {
        return department_id;
    }


    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }


    public Integer getPosition_id() {
        return position_id;
    }


    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }


    public Integer getManager_id() {
        return manager_id;
    }


    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }


    
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

