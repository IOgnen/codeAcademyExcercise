package org.main.company.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name = "department")
public class Department {

	@Column(name = "name")
	private String dName;
	
	@Id
	@Column(name = "number")
	private Integer dNumber;
	
	@Column(name = "super_ssn")
	private long superSsn;
	
	@Column(name = "start_date")
	private Date dDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_number")
	private List<Project> project;
	
	@OneToMany
	@JoinColumn(name = "dept_number")
	private Set<DepartmentLocations> departmentLocations;
	
	public Department() {
		super();
	}
	public Department(String dName, Integer dNumber, long superSsn, Date dDate) {
		super();
		this.dName = dName;
		this.dNumber = dNumber;
		this.superSsn = superSsn;
		this.dDate = dDate;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Integer getdNumber() {
		return dNumber;
	}
	public void setdNumber(Integer dNumber) {
		this.dNumber = dNumber;
	}
	public long getSuperSsn() {
		return superSsn;
	}
	public void setSuperSsn(long superSsn) {
		this.superSsn = superSsn;
	}
	public Date getdDate() {
		return dDate;
	}
	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}
	
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Set<DepartmentLocations> getDepartmentLocations() {
		return departmentLocations;
	}
	public void setDepartmentLocations(Set<DepartmentLocations> departmentLocations) {
		this.departmentLocations = departmentLocations;
	}
	
}
