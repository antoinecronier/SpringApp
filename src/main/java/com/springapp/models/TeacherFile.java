package com.springapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherFile")
public class TeacherFile extends File {
	@ManyToOne
	private Namespace namespace;

	public Namespace getNamespace() {
		return namespace;
	}

	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}

	public TeacherFile() {
		super();
	}

	public TeacherFile(Integer id) {
		super(id);
	}

	public TeacherFile(String name, Namespace namespace) {
		super(name);
		this.namespace = namespace;
	}
}
