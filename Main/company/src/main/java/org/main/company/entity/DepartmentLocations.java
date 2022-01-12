package org.main.company.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "departmentLocations")
public class DepartmentLocations {
	
	@EmbeddedId
	private DepartmentLocationsId departmentLocationsId;
	
	public DepartmentLocations() {
		super();
	}
	
	public DepartmentLocationsId getDepartmentLocationsId() {
		return departmentLocationsId;
	}

	public void setDepartmentLocationsId(DepartmentLocationsId departmentLocationsId) {
		this.departmentLocationsId = departmentLocationsId;
	}

	public DepartmentLocations(DepartmentLocationsId departmentLocationsId) {
		super();
		this.departmentLocationsId = departmentLocationsId;
	}
	
	
	
}
