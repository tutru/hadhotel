package com.had.hadhotel.model;

import java.util.Date;

public class EmployeeInfo {
	private int employeeid;
	private String name;
	private Date birthday;
	private int governmentid;
	private String phone;
	private String email;
	private String address;
	private String image;
	private Double salary;
	
	
	public EmployeeInfo() {
		super();
		
	}


	public EmployeeInfo(int employeeid, String name, Date birthday, int governmentid, String phone, String email,
			String address, String image, Double salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.birthday = birthday;
		this.governmentid = governmentid;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.image = image;
		this.salary = salary;
	}


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public int getGovernmentid() {
		return governmentid;
	}


	public void setGovernmentid(int governmentid) {
		this.governmentid = governmentid;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
