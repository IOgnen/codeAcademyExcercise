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

		Scanner vnes = new Scanner(System.in);

		int x, y, z;
		int najgolemMak = 0;
		int najgolemMat = 0;
		int najgolemIst = 0;
		double proseMak = 0;
		double proseMat = 0;
		double proseIst = 0;
		int zbirMak=0;
		int zbirMat=0;
	    int zbirIst=0;

		Student a = new Student("Mari");
		Student b = new Student("Pece");
		Student c = new Student("Koch");

		Student[] site = { a, b, c };
		
		for (Student student : site) {
			
			System.out.println("Vnesi Ocenki za: "+ student.getStudent());
			System.out.print("Makedonski: ");
			x = vnes.nextInt();
			System.out.print("Matematika: ");
			y = vnes.nextInt();
			System.out.print("Istorija  : ");
			z = vnes.nextInt();
			
			student.addOcenka(x, y, z);
		}

		for (int i = 0; i < site.length; i++) {
			System.out.println(site[i].getSubject());
		}
	
		for (int i = 0; i < site.length; i++) {
			if (site[i].getMakOcenka() > najgolemMak)
				najgolemMak = site[i].getMakOcenka();
			if (site[i].getMatOcenka() > najgolemMat)
				najgolemMat = site[i].getMatOcenka();
			if (site[i].getIstOcenka() > najgolemIst)
				najgolemIst = site[i].getIstOcenka();
			
			zbirMak = zbirMak + site[i].getMakOcenka();
			zbirMat = zbirMat + site[i].getMatOcenka();
			zbirIst = zbirIst + site[i].getIstOcenka();
		}
		
		proseMak = (double)zbirMak / (double)site.length;
		proseMat = (double)zbirMat / (double)site.length;
		proseIst = (double)zbirIst / (double)site.length;
		
		System.out.println("Prosek\n Mak: " + proseMak +" "+ "Mat: "+ proseMat+" "+"Ist: "+proseIst);
		System.out.println("Najgolema\nMak: " +najgolemMak+" "+ "Mat: "+ najgolemMat+" "+"Ist: "+najgolemIst);

	}
}