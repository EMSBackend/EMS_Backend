package com.monocept.ems.Authentication.DTO;

public class LoginResponseDTO {

	private String emailId;

	private String employeeName;

	private String jwt;

	private String employeeRole;

	public LoginResponseDTO(String email, String firstName, String lastName, String role, String jwtToken) {
		super();
		this.emailId = email;
		this.employeeName = firstName + " " + lastName;
		this.employeeRole = "ADMIN";
		this.jwt = jwtToken;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

}
