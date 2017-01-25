package com.springapp.models.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import com.springapp.models.base.EntityBase;

@Entity
@Table(name = "securityrole")
@Inheritance
public class SecurityRole {
	@Id
	private Integer user_role_id;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	private String role;

	/**
	 * @return the role
	 */
	protected String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	protected void setRole(String role) {
		this.role = role;
	}
}
