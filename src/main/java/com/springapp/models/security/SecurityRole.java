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
	 * @return the user_role_id
	 */
	protected Integer getUser_role_id() {
		return user_role_id;
	}
	/**
	 * @param user_role_id the user_role_id to set
	 */
	protected void setUser_role_id(Integer user_role_id) {
		this.user_role_id = user_role_id;
	}
	/**
	 * @return the username
	 */
	protected String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	protected void setUsername(String username) {
		this.username = username;
	}
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
