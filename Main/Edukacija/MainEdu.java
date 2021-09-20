package Edukacija;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEdu {
	public static void main(String[] args) throws IOException {

		File file1 = new File("text.txt");
		FileWriter fw = new FileWriter(file1);
		PrintWriter pw = new PrintWriter(fw);
		Scanner vnes = new Scanner(System.in);

		Student a = new Student("Mario");
		Student b = new Student("Pece");
		Student c = new Student("Kocho");
		
		Subject d = new Subject("Matematika");
		Subject e = new Subject("Makedonski");
		Subject f = new Subject("Istorija");
		
		Student[] site = {a,b,c};
		Subject[] sitee = {d,e,f};
		
		for (int i=0; i<2 ; i++) {
			int x = vnes.nextInt();
			 
			
		}
		


		
		
		
		pw.close();

	}
}
