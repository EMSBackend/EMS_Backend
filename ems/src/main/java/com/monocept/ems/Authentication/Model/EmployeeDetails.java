// package com.monocept.ems.authentication.Model;
// package com.monocept.ems.Authentication.Model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name = "EmployeeDetails")
// public class EmployeeDetails {

// 	@Id
// 	@Column(name = "EmployeeId", columnDefinition = "VARCHAR(100)", nullable = false, unique = true)
// 	private String employeeId;

// 	@Column(name = "FirstName", columnDefinition = "VARCHAR(100)", nullable = false)
// 	private String firstName;

// 	@Column(name = "LastName", columnDefinition = "VARCHAR(100)", nullable = false)
// 	private String lastName;

// 	@Column(name = "Address", columnDefinition = "VARCHAR(100)", nullable = false)
// 	private String address;

// 	@Column(name = "MobileNumber", columnDefinition = "VARCHAR(15)", nullable = false, unique = true)
// 	private String mobileNumber;

// 	@Column(name = "EmailId", columnDefinition = "VARCHAR(100)", nullable = false, unique = true)
// 	private String email;

// 	@Column(name = "Password", columnDefinition = "VARCHAR(256)", nullable = false)
// 	private String password;

// 	@Column(name = "Role", columnDefinition = "VARCHAR(10)", nullable = false)
// 	private String role;

// 	@Column(name = "Status", columnDefinition = "VARCHAR(10)", nullable = false)
// 	private String status;

// 	public EmployeeDetails(String empId, String password, String email) {
// 		super();
// 		this.employeeId = empId;
// 		this.password = password;
// 		this.email = email;
// 		this.role = "ADMIN";
// 	}

// 	public String getEmployeeId() {
// 		return employeeId;
// 	}

// 	public void setEmployeeId(String employeeId) {
// 		this.employeeId = employeeId;
// 	}

// 	public String getEmail() {
// 		return email;
// 	}

// 	public void setEmail(String email) {
// 		this.email = email;
// 	}

// 	public String getPassword() {
// 		return password;
// 	}

// 	public void setPassword(String password) {
// 		this.password = password;
// 	}

// 	public String getFirstName() {
// 		return firstName;
// 	}

// 	public void setFirstName(String firstName) {
// 		this.firstName = firstName;
// 	}

// 	public String getLastName() {
// 		return lastName;
// 	}

// 	public void setLastName(String lastName) {
// 		this.lastName = lastName;
// 	}

// 	public String getAddress() {
// 		return address;
// 	}

// 	public void setAddress(String address) {
// 		this.address = address;
// 	}

// 	public String getMobileNumber() {
// 		return mobileNumber;
// 	}

// 	public void setMobileNumber(String mobileNumber) {
// 		this.mobileNumber = mobileNumber;
// 	}

// 	public String getRole() {
// 		return role;
// 	}

// 	public void setRole(String role) {
// 		this.role = role;
// 	}

// 	public String getStatus() {
// 		return status;
// 	}

// 	public void setStatus(String status) {
// 		this.status = status;
// 	}

// }
