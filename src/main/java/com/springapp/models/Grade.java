package com.springapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.springapp.models.base.EntityBase;

@Entity
@Table(name = "Grade")
public class Grade extends EntityBase {

	@Column(nullable = false)
	private String name;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date periodStart;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date periodEnd;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPeriodStart() {
		return periodStart;
	}
	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}
	public Date getPeriodEnd() {
		return periodEnd;
	}
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Grade() {
		super();
	}

	public Grade(Integer id) {
		super(id);
	}

	public Grade(String name, Date periodStart, Date periodEnd) {
		super();
		this.name = name;
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;
	}
}
