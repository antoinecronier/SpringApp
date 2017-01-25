package com.springapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
@Inheritance
public class Teacher extends User {
	@Column(nullable = true)
	private String socity;

	public String getSocity() {
		return socity;
	}

	public void setSocity(String socity) {
		this.socity = socity;
	}

	public Teacher() {
		super();
	}

	public Teacher(Integer id){
		super(id);
	}

	public Teacher(String firstname, String lastname, String login,
			String password, String socity) {
		super(firstname, lastname, login, password);
		this.socity = socity;
	}
}
