package com.had.hadhotel.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
	private static final long serialVersionUID = -7893237204476214050L;
	private int employeeid;
	private String name;
	private Date birthday;
	private int governmentid; 
	private String phone;
	private String email;
	private String address;
	private String image;
	private Double salary;
	
	@Id
	@Column(name = "EMPLOYEE_ID", nullable = false)
	public int getEmployeeid() {
		return employeeid;
	}
	
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	@Column(name = "EMPLOYEE_NAME",length = 50, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "EMPLOYEE_BIRTHDAY", nullable = false)
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Column(name = "GOVERNMENT_ID", nullable = false)
	public int getGovernmentid() {
		return governmentid;
	}
	public void setGovernmentid(int governmentid) {
		this.governmentid = governmentid;
	}
	@Column(name = "EMPLOYEE_PHONE",length = 12, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name = "EMPLOYEE_EMAIL",length = 50, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "EMPLOYEE_ADDRESS",length = 50, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "EMPLOYEE_IMAGE",length = 50, nullable = false)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Column(name = "EMPLOYEE_SALARY", nullable = false)
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
