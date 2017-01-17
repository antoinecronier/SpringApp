package com.springapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.springapp.models.base.EntityBase;

@MappedSuperclass
@Inheritance
public abstract class User extends EntityBase {
	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String password;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User(){
		super();
	}

	public User(Integer id) {
		super(id);
	}

	public User(String firstname, String lastname, String login, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
	}
}
