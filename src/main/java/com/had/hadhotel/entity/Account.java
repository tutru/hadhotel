package com.had.hadhotel.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Account {
	private static final long serialVersionUID = -7893237204476214050L;
	private int account_id;
	private int employee_id;
	private int role_id;
	private String username;
	private String password;
	@Id
	@Column(name = "ACCOUNT_ID", nullable = false)
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	@Column(name = "EMPLOYEE_ID", length = 50, nullable = false)
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	@Column(name = "ROLE_ID", length = 50, nullable = false)
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	@Column(name = "USERNAME", length = 50, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "PASSWORD", length = 50, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
