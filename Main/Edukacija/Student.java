package Edukacija;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	Subject Mak = new Subject();
	Subject Mat = new Subject();
	Subject Ist = new Subject();
	
	public String name;
	
	public Student(String name) {
		this.name=name;
	}
	
	public String getStudent() {
		return this.name;
	}
	
	public void addOcenka(int x,int y, int z) {
		Mak.setOcenka(x);
		Mat.setOcenka(y);
		Ist.setOcenka(z);
	}
	
	public String getSubject(){
		return this.name +" " 
						+ Mak.getPredmet() +" "
						+ Mak.getOcenka() +" "
						+ Mat.getPredmet() + " "
						+ Mat.getOcenka() + " "
						+ Ist.getPredmet() + " "
						+ Ist.getOcenka(); 
		
	}

	public int getMakOcenka() {
		return Mak.getOcenka();
	}
	public int getMatOcenka() {
		return Mat.getOcenka();
	}
	public int getIstOcenka() {
		return Ist.getOcenka();
	}
	

}