package com.monocept.ems.Authentication.Model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JwtToken")
public class JwtToken {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TokenId", updatable = false, nullable = false, unique = true)
	private Long id;

	@Column(name = "EmployeeId", columnDefinition = "VARCHAR(100)", nullable = false)
	private String employeeId;

	@Column(name = "Token", columnDefinition = "VARCHAR(255)", nullable = false)
	private String token;

	@Column(name = "Status", columnDefinition = "VARCHAR(10)", nullable = false)
	private String status;

	@Column(name = "CreatedOn", nullable = false)
	private Date createdOn;

	@Column(name = "ExpiredOn", nullable = false)
	private Date expiredOn;

	@Column(name = "EmailId", nullable = false)
	private String emailId;

	public JwtToken(String employeeId, String email, String jwtToken) {
		super();
		this.employeeId = employeeId;
		this.emailId = email;
		this.token = jwtToken;
		this.createdOn = new Date();
		this.expiredOn = getExpiredTime(this.createdOn);
		this.status = "ACTIVE";
	}

	private Date getExpiredTime(Date createdOn) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(createdOn);
		calendar.add(Calendar.MINUTE, 15);
		return calendar.getTime();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getExpiredOn() {
		return expiredOn;
	}

	public void setExpiredOn(Date expiredOn) {
		this.expiredOn = expiredOn;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public JwtToken() {
		super();
	}

}
