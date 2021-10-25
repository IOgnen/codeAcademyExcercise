package Edukacija;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public Integer index;
	public String name;
	public String surname;
	public City city;
	public List<Subject> subject = new ArrayList<>();

	public Student(Integer index, String name, String surname) {
		this.index = index;
		this.surname = surname;
		this.name = name;
	}
	
	public void initData() {
		subject.add(new Subject("Makedonski",7));
		subject.add(new Subject("Matematika",8));
		subject.add(new Subject("Fizika",9));
		subject.add(new Subject("IT",5));
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getIndex() {
		return index;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public City getCity() {
		return this.city;
	}
	
	

	@Override
	public String toString() {
		return "Student [index=" + index + ", name=" + name + ", surname=" + surname + ", city=" + city + ", subject="
				+ subject + "]" + "\n";
	}

}