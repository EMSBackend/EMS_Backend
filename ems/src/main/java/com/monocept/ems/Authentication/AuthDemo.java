package com.monocept.ems.Authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AuthDemo")
public class AuthDemo {

	@Id
	@Column(name = "Id")
	private int id;

}
