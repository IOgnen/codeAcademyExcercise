package Edukacija;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	String predmet;
	int ocenka;
	int najgolema;

	public Subject() {
		
	}
	
	public Subject(String y) {
		this.predmet = y;
	}

	public void setOcenka(int i) {
		this.ocenka = i;
	}
	
	public int getOcenka() {
		return ocenka;
		
	}
	
	public String getPredmet() {
		return predmet;
	}
	
	public int Najgolema(Subject x) {
		if (this.ocenka > x.ocenka)
			najgolema = this.ocenka;
		return najgolema;
	}
}