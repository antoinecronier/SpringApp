package com.springapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student extends User {
	@ManyToOne
	private Grade grade;

	@OneToMany
	List<Project> projects;

	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Student() {
		super();
	}

	public Student(Integer id) {
		super(id);
	}

	public Student(String firstname, String lastname, String login,
			String password,Grade grade, List<Project> projects) {
		super(firstname, lastname, login, password);
		this.grade = grade;
		this.projects = projects;
	}
}
