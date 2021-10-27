package Edukacija;

import java.io.IOException;
import java.util.ArrayList;

public class MainEdu {
	
	public static void main(String[] args) throws IOException {

		StudentService start = new StudentService("Resources/data.txt");
		
//		System.out.println(start.getByIndex(1596));
//		System.out.println(start.getByNameSurname("Petkovski"));
//		System.out.println(start.getByCity(City.Bitola));
		System.out.println(start.polozheniMakedonski());
		
		
		
		
	}
}