package org.main.studentDB;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		StudentDAO start = new StudentDAOImpl();
		
		List<Student> students = new ArrayList<>();
		
		students = start.readStudent("Resources/data.txt");
		
//		start.printStudents();
		
//		start.createStudentTable();
		
//		start.insertStudents(students);
		
//		start.createProfesorTable();
		
//		start.createSubjectTable();
		
//		start.insertProfesor(students);
		
//		start.insertSubject(students);
		
//		start.createStudentSubjectTable();
		
//		start.insertOcenka(students);
		
//		start.searchPolozheniMakedonski(SubjectNames.Istorija, 6);
		
		start.searchProfesor(1358, SubjectNames.Fizika);
		
	}
	
}
