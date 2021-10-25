package Edukacija;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

	public final List<Student> students = new ArrayList<>();

	public StudentService(String csvPath) {

		try (BufferedReader reads = new BufferedReader(new FileReader(csvPath));) {

			String lines[] = new String[4];
			String line;
			Integer y = 0;

			while ((line = reads.readLine()) != null) {
				
				lines[y]= line;
				y++;
			}

			for (int i = 0; i < lines.length; i++) {

				String row[] = lines[i].split(";");
				List<Subject> predmet = new ArrayList<Subject>();
				
				
				
				Student x = new Student(1456,"Ognen","Iloski");
				x.setCity(City.valueOf("Skopje"));
				students.add(x);
				

			}
			System.out.println(students);

		} catch (IOException e) {
			System.err.println("Failed reading CSV file");
		}
	}
	
	
	
	
}
	
	


