package Edukacija;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public String name;

	public Student() {

	}

	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return "Ime:" + name;
	}
}
