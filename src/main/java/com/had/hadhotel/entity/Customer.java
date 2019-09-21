package com.had.hadhotel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer  implements Serializable {
	
	private static final long serialVersionUID = -7893237204476214050L;
	private int customerid;
	private String customername;
	private String governmentid;
	private String customeraddress;
	private String phone;
	private String email;
	private String ccnumber;
	
	@Id
	@Column(name = "CUSTOMER_ID", nullable = false)
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Column(name = "CUSTOMER_NAME", length = 50, nullable = false)
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Column(name = "GOVERNMENT_ID", length = 50, nullable = false)
	public String getGovernmentid() {
		return governmentid;
	}
	public void setGovernmentid(String governmentid) {
		this.governmentid = governmentid;
	}
	@Column(name = "CUSTOMER_ADDRESS", length = 50, nullable = false)
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Column(name = "PHONE", length = 50, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name = "EMAIL", length = 50, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "CCNUMBER", length = 50, nullable = false)
	public String getCcnumber() {
		return ccnumber;
	}
	public void setCcnumber(String ccnumber) {
		this.ccnumber = ccnumber;
	}

}
