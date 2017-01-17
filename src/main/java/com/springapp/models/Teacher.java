package com.springapp.models;

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

	public Teacher(String teacher) {
		super.setFirstname(teacher.split("&")[0].split("=")[1]);
		super.setLastname(teacher.split("&")[1].split("=")[1]);
		super.setLogin(teacher.split("&")[2].split("=")[1]);
		super.setPassword(teacher.split("&")[3].split("=")[1]);
		this.setSocity(teacher.split("&")[4].split("=")[1]);
	}

	public Teacher(String firstname, String lastname, String login,
			String password, String socity) {
		super(firstname, lastname, login, password);
		this.socity = socity;
	}
}
