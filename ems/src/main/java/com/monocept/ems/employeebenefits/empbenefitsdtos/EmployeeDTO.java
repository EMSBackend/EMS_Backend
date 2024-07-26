package com.monocept.ems.employeebenefits.empbenefitsdtos;

import java.sql.Date;

import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeModel;


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
