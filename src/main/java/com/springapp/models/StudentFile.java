package com.springapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentFile")
public class StudentFile extends File{
	@ManyToOne
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public StudentFile() {
		super();
	}

	public StudentFile(Integer id) {
		super(id);
	}

	public StudentFile(String name, Project project) {
		super(name);
		this.project = project;
	}
}
