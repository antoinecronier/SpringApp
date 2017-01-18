package com.springapp.models;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

import com.springapp.models.base.EntityBase;

@MappedSuperclass
@Inheritance
public abstract class File extends EntityBase {
	@Column(nullable = false)
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public File(){
		super();
	}

	public File(Integer id) {
		super(id);
	}

	public File(String name) {
		super();
		this.name = name;
	}
}
