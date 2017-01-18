package com.springapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.springapp.models.base.EntityBase;

@Entity
@Table(name = "Project")
public class Project extends EntityBase {
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String repoUrl;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date validate;

	@ManyToOne
	private Namespace namespace;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRepoUrl() {
		return repoUrl;
	}
	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
	}
	public Date getValidate() {
		return validate;
	}
	public void setValidate(Date validate) {
		this.validate = validate;
	}
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}

	public Project() {
		super();
	}

	public Project(Integer id) {
		super(id);
	}

	public Project(String name, String repoUrl, Date validate,
			Namespace namespace) {
		super();
		this.name = name;
		this.repoUrl = repoUrl;
		this.validate = validate;
		this.namespace = namespace;
	}
}
