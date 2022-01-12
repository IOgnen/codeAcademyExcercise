package Mini;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

	private String name;
	private Integer score;
	
	public Student() {
		super();
	}

	public Student(String name,Integer score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	public static List<String> studentsThatPass(Stream<Student> students,Integer score){
		
		return students.filter(student -> student.getScore() > score)
					.sorted(Comparator.comparingInt(Student::getScore).reversed())
					.map(el -> el.name)
					.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ogi", 87));
		students.add(new Student("Mile",57));
		students.add(new Student("Goce",21));
		students.add(new Student("Ace",68));
		students.add(new Student("Mice",78));
		students.add(new Student("Pece",24));
		
		studentsThatPass(students.stream(),50).forEach(System.out::println);
		
	}	
	
}
