package Edukacija;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Student {
	
	String predmet;
	int ocenka;

	public Subject(String y) {
		this.predmet = y;
	}

	public void setOcenka(int i) {
		this.ocenka = i;
	}
	
	public void addPredmet() {
		
	}
}
