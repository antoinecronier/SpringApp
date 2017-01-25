package com.springapp.models.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name = "securityuser")
@Inheritance
public class SecurityUser {
	@Id
	private String username;
	private String password;
	private Boolean enabled;

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
	 * @return the password
	 */
	protected String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	protected void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the enabled
	 */
	protected Boolean getEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	protected void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
