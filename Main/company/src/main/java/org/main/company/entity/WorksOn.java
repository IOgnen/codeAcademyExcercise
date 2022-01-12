package org.main.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "works_on")
public class WorksOn {

	@EmbeddedId
	private WorksOnId worksOnId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("ssn")
	private Employee employee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("pNumber")
	private Project project;
	
	private double hours;
	
	public WorksOn() {
		super();
	}

	public WorksOn(WorksOnId worksOnId, Employee employee, Project project, double hours) {
		super();
		this.worksOnId = worksOnId;
		this.employee = employee;
		this.project = project;
		this.hours = hours;
	}

	public WorksOnId getWorksOnId() {
		return worksOnId;
	}

	public void setWorksOnId(WorksOnId worksOnId) {
		this.worksOnId = worksOnId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
	
}
