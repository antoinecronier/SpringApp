package com.springapp.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.springapp.models.base.EntityBase;

@Entity
@Table(name = "Namespace")
public class Namespace extends EntityBase {
	@Column(nullable = false)
	private String name;

	@Column(nullable = true)
	private String description;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dueDate;

	@ManyToOne
	private Grade grade;

	@ManyToOne
	private Teacher teacher;

	@OneToMany
	private List<Project> projects;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Namespace() {
		super();
	}

	public Namespace(Integer id) {
		super(id);
	}

	public Namespace(String name, String description, Date dueDate,
			Grade grade, Teacher teacher, List<Project> projects) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.grade = grade;
		this.teacher = teacher;
		this.projects = projects;
	}
}
