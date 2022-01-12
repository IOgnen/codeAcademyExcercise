package org.main.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DepartmentLocationsId implements Serializable {

	@Column(name = "department_number")
	private Integer dNumber;
	@Column(name = "location")
	private String dlocation;
	
	public DepartmentLocationsId() {
		super();
	}
	public DepartmentLocationsId(Integer dNumber, String dlocation) {
		super();
		this.dNumber = dNumber;
		this.dlocation = dlocation;
	}
	public Integer getdNumber() {
		return dNumber;
	}
	public void setdNumber(Integer dNumber) {
		this.dNumber = dNumber;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	
}
