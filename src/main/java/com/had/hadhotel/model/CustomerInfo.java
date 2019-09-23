package com.had.hadhotel.model;

public class CustomerInfo {
	private int customerid;
	private String customername;
	private String governmentid;
	private String customeraddress;
	private String phone;
	private String email;
	private String ccnumber;
	public CustomerInfo() {
		super();
	}
	public CustomerInfo(int customerid, String customername, String governmentid, String customeraddress, String phone,
			String email, String ccnumber) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.governmentid = governmentid;
		this.customeraddress = customeraddress;
		this.phone = phone;
		this.email = email;
		this.ccnumber = ccnumber;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getGovernmentid() {
		return governmentid;
	}
	public void setGovernmentid(String governmentid) {
		this.governmentid = governmentid;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
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
	public String getCcnumber() {
		return ccnumber;
	}
	public void setCcnumber(String ccnumber) {
		this.ccnumber = ccnumber;
	}
	
	
}
