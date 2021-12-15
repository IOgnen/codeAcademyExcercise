package org.main.studentDB;

import java.util.List;

public interface StudentDAO {

	public void printStudents();
	public List<Student> readStudent(String csvPath);
	public void createStudentTable();
	public void createProfesorTable();
	public void createSubjectTable();
	public void createStudentSubjectTable();
	public void insertStudents(List<Student> students);
	public void insertSubject(List<Student> students);
	public void insertProfesor(List<Student> students);
	public void insertOcenka(List<Student> students);
	
	public void searchPolozheniMakedonski(SubjectNames s, Integer ocenka);
	public void searchProfesor(Integer index, SubjectNames s);
	
	
}
