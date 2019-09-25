package com.had.hadhotel.model;

public class AccountInfo {
	private int account_id;
	private int employee_id;
	private int role_id;
	private String username;
	private String password;
	public AccountInfo() {
		super();
	}
	public AccountInfo(int account_id, int employee_id, int role_id, String username, String password) {
		super();
		this.account_id = account_id;
		this.employee_id = employee_id;
		this.role_id = role_id;
		this.username = username;
		this.password = password;
	}
	public int getaccount_id() {
		return account_id;
	}
	public void setaccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
