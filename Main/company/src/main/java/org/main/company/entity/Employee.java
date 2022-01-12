package org.main.company.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private char middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Id
	@Column(name = "number")
	private long ssn;
	
	@Column(name = "birth_date")
	private Date bDate;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "sex")
	private char sex;
	
	@Column(name = "salary")
	private Integer salary;
	
	@Column(name = "super_ssn")
	private long superSsn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="department_number")
	private Department department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "empoloyee_number")
	private List<Dependent> dependent;
	
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true , mappedBy = "employee")
	private List<WorksOn> worksOn;
	
	public List<Dependent> getDependent() {
		return dependent;
	}
	public void setDependent(List<Dependent> dependent) {
		this.dependent = dependent;
	}
	public List<WorksOn> getWorksOn() {
		return worksOn;
	}
	public void setWorksOn(List<WorksOn> worksOn) {
		this.worksOn = worksOn;
	}
	public Employee() {
		super();
	}
	public Employee(String firstName, char middleName, String lastName, long ssn, Date bDate, String address,
			char sex, Integer salary, long superSsn) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.bDate = bDate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.superSsn = superSsn;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public char getMiddleName() {
		return middleName;
	}
	public void setMiddleName(char middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public long getSuperSsn() {
		return superSsn;
	}
	public void setSuperSsn(long superSsn) {
		this.superSsn = superSsn;
	}
		
}
