package org.main.company.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name = "dependant")
public class Dependent implements Serializable {
	
	@EmbeddedId
	private DependentId dependentId;
	
	@Column(name = "sex")
	private char dependantSex;
	
	@Column(name = "date")
	private Date dependantDate;
	
	@Column(name = "relation")
	private String relation;
	
	public Dependent() {
		super();
	}
	public Dependent(char dependantSex, Date dependantDate, String relation) {
		super();
		this.dependantSex = dependantSex;
		this.dependantDate = dependantDate;
		this.relation = relation;
	}
	
	public DependentId getDependentId() {
		return dependentId;
	}
	public void setDependentId(DependentId dependentId) {
		this.dependentId = dependentId;
	}
	
	public char getDependantSex() {
		return dependantSex;
	}
	public void setDependantSex(char dependantSex) {
		this.dependantSex = dependantSex;
	}
	public Date getDependantDate() {
		return dependantDate;
	}
	public void setDependantDate(Date dependantDate) {
		this.dependantDate = dependantDate;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}
