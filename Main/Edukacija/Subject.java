package Edukacija;

public class Subject {
	
	String predmet;
	Integer ocenka;
	boolean polozen;
	
	public Subject(String predmet,Integer ocenka) {
		this.predmet = predmet;
		this.ocenka = ocenka;
	}
	
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public int getOcenka() {
		return ocenka;
	}
	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}
	public boolean isPolozen() {
		return polozen;
	}
	public void setPolozen(boolean polozen) {
		this.polozen = polozen;
	}
	
}