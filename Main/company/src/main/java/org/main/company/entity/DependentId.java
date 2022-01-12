package org.main.company.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DependentId implements Serializable { 

	private long eSsn;
	private String dependantName;
	
	public DependentId() {
		super();
	}
	public DependentId(long eSsn, String dependantName) {
		super();
		this.eSsn = eSsn;
		this.dependantName = dependantName;
	}
	public long geteSsn() {
		return eSsn;
	}
	public void seteSsn(long eSsn) {
		this.eSsn = eSsn;
	}
	public String getDependantName() {
		return dependantName;
	}
	public void setDependantName(String dependantName) {
		this.dependantName = dependantName;
	}
	
	
	
}
