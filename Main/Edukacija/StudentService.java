package Edukacija;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

	public final ArrayList<Student> students = new ArrayList<>();

	public StudentService(String csvPath) {

		try (BufferedReader reads = new BufferedReader(new FileReader(csvPath));) {

			ArrayList<String> lines = new ArrayList<>();
			String line;
			Integer y = 0;

			while ((line = reads.readLine()) != null) {

				lines.add(line);
				y++;

			}

			for (int i = 0; i < lines.size(); i++) {

				ArrayList<Subject> predmet = new ArrayList<>();
				
				String row[] = lines.get(i).split(";");

				Integer index = Integer.parseInt(row[0]);

				String sub[];
				Integer ocenka;

				for (int j = 0; j < 4; j++) {

					sub = row[j + 6].split(",");
					ocenka = Integer.parseInt(sub[1]);
					Subject subject = new Subject(SubjectNames.valueOf(sub[0]), ocenka);
					predmet.add(subject);

				}

				Student x = new Student(index, row[1], row[2], City.valueOf(row[5]), predmet);

				students.add(x);
				
			

			}
			System.out.println(students);

		} catch (IOException e) {
			System.err.println("Failed reading CSV file");
		}
	}
	
	public ArrayList<Student> getByCity(City city){
		
		ArrayList<Student> result = new ArrayList<>();
		
		for(Student student : students) {
			
			if(student.getCity().equals(city)) {
				result.add(student);
			}
			
		}
	return result;
	}

	public Student getByNameSurname(String nameSurname) {
		
		for(Student student : students) {
			
			if(student.getName().equals(nameSurname)||student.getSurname().equals(nameSurname)) {
				return student;
			}
		}
	return null;
	}
	
	public Student getByIndex(Integer index) {

		for (Student student : students) {

			if (student.getIndex().equals(index)) {
				return student;
			}
			
		}
		return null;
	}
	
	public ArrayList<Student> polozheniMakedonski(){
		
		ArrayList<Student> result = new ArrayList<>();
		
		for(Student student : students) {
			if(student.getMakedonski().isPolozen()) {
				result.add(student);
			}
		}
	return result;
	}
	
	public ArrayList<Student> polozheniMatematika(){
		
		ArrayList<Student> result = new ArrayList<>();
		
		for(Student student : students) {
			if(student.getMatematika().isPolozen()==true) {
				result.add(student);
			}
		}
	return result;
	}
	
	public ArrayList<Student> polozheniFizika(){
		
		ArrayList<Student> result = new ArrayList<>();
		
		for(Student student : students) {
			if(student.getFizika().isPolozen()==true) {
				result.add(student);
			}
		}
	return result;
	}
	
	public ArrayList<Student> polozheniIstorija(){
		
		ArrayList<Student> result = new ArrayList<>();
		
		for(Student student : students) {
			if(student.getIstorija().isPolozen()==true) {
				result.add(student);
			}
		}
	return result;
	}

	public ArrayList<Subject> getMakedonski() {

		ArrayList<Subject> result = new ArrayList<>();

		for (Student student : students) {

			result.add(student.getMakedonski());

		}
		return result;
	}

}
