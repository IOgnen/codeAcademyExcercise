package Edukacija;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {

	public final List<Student> students = new ArrayList<>();

	public void printStudents() {
		
		for(Student student : students) {
			
			System.out.println(student);
			
		}
		
	}
	
	public StudentService(String csvPath) {

		try (BufferedReader reads = new BufferedReader(new FileReader(csvPath));) {

			List<String> lines = new ArrayList<>();
			String line;
			Integer y = 0;

			while ((line = reads.readLine()) != null) {

				lines.add(line);
				y++;

			}

			for (int i = 0; i < lines.size(); i++) {

				List<Subject> predmet = new ArrayList<>();
				List<Profesor> profesori = new ArrayList<>();
				String sub[];
				Integer ocenka;

				String row[] = lines.get(i).split(";");

				Integer index = Integer.parseInt(row[0]);

				Profesor pMate = new Profesor("Goce", SubjectNames.Matematika, "goce@email.com");
				Profesor pMake = new Profesor("Mile", SubjectNames.Makedonski, "mile@email.com");
				Profesor pFizi = new Profesor("Pero", SubjectNames.Fizika, "pero@email.com");
				Profesor pIsto = new Profesor("Laze", SubjectNames.Istorija, "laze@email.com");

				profesori.add(pMate);
				profesori.add(pMake);
				profesori.add(pIsto);
				profesori.add(pFizi);

				for (int j = 0; j < 4; j++) {

					sub = row[j + 6].split(",");
					ocenka = Integer.parseInt(sub[1]);
					Subject subject = new Subject(SubjectNames.valueOf(sub[0]), ocenka, profesori.get(j));
					predmet.add(subject);

				}

				Student x = new Student(index, row[1], row[2], City.valueOf(row[5]), predmet);

				students.add(x);

			}

		} catch (IOException e) {
			System.err.println("Failed reading CSV file");
		}
	}

	public List<String> getProfesori(Integer index) {

		List<String> result = new ArrayList<String>();

		for (Student student : students) {

			if (student.getIndex().equals(index)) {

				for (int i = 0; i < 4; i++) {
					result.add(student.getSubject().get(i).getProfesor().toString());
				}

			}
		}

		return result;

	}

	public List<Student> getByCity(City city) {

		List<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getCity().equals(city)) {
				result.add(student);
			}

		}
		return result;
	}

	public Student getByNameSurname(String nameSurname) {

		for (Student student : students) {

			if (student.getName().equals(nameSurname) || student.getSurname().equals(nameSurname)) {
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

	public List<Student> polozheniMakedonski() {

		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.getMakedonski().isPolozen()) {
				result.add(student);
			}
		}
		return result;
	}

	public List<Student> polozheniMatematika() {

		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.getMatematika().isPolozen() == true) {
				result.add(student);
			}
		}
		return result;
	}

	public List<Student> polozheniFizika() {

		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.getFizika().isPolozen() == true) {
				result.add(student);
			}
		}
		return result;
	}

	public List<Student> polozheniIstorija() {

		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.getIstorija().isPolozen() == true) {
				result.add(student);
			}
		}
		return result;
	}

	public List<Subject> getMakedonski() {

		List<Subject> result = new ArrayList<>();

		for (Student student : students) {

			result.add(student.getMakedonski());

		}
		return result;
	}

	public HashMap<Integer, List<Subject>> getPolozheniSubjects(Integer index) {

		HashMap<Integer, List<Subject>> result = new HashMap<Integer, List<Subject>>();
		List<Subject> pred = new ArrayList<Subject>();
		
		for(Student student : students) {
			
			if(index.equals(student.getIndex())) {
				
				for(int i = 0; i < student.getSubject().size();i++) {
					
					if(student.getSubject().get(i).isPolozen()) {
						
						pred.add(student.getSubject().get(i));
					}
					
				}
			result.put(index,pred);
				
			}
			
		}
		
		
		return result;

	}

	
}
