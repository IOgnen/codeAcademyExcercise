package org.main.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WorksOnId implements Serializable {

	private long ssn;

	private Integer pNumber;

	public WorksOnId() {
		super();
	}

	public WorksOnId(long ssn, Integer pNumber) {
		super();
		this.ssn = ssn;
		this.pNumber = pNumber;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public Integer getpNumber() {
		return pNumber;
	}

	public void setpNumber(Integer pNumber) {
		this.pNumber = pNumber;
	}
	
	
	
}
