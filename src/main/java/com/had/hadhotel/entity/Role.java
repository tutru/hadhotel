package com.had.hadhotel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {
	private static final long serialVersionUID = -7893237204476214050L;
	private int role_id;
	private String role_name;
	private String role_desc;

	@Id
	@Column(name = "ROLE_ID", nullable = false)
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	@Column(name = "ROLE_NAME", length = 50, nullable = false)
	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Column(name = "ROLE_DESC", length = 50, nullable = false)
	public String getRole_desc() {
		return role_desc;
	}

	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}

}
