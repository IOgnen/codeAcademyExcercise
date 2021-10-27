package Edukacija;

public class Subject {
	
	SubjectNames predmet;
	private Integer ocenka;
	private boolean polozen;
	
	@Override
	public String toString() {
		return "Subject [predmet=" + predmet + ", ocenka=" + ocenka + ", polozen=" + polozen + "]";
	}

	public Subject(SubjectNames predmet,Integer ocenka) {
		this.predmet = predmet;
		this.ocenka = ocenka;
		if(ocenka>5) 
			polozen = true;
		else
			polozen = false;
	}
	
	public void setOcenka(Integer ocenka) {
		this.ocenka = ocenka;
	}

	public SubjectNames getPredmet() {
		return predmet;
	}
	public void setPredmet(SubjectNames predmet) {
		this.predmet = predmet;
	}
	public int getOcenka() {
		return ocenka;
	}
	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}
	public boolean isPolozen() {
		if(ocenka>5) {
		return true;
		}
		return false;
	}
	public void setPolozen(boolean polozen) {
		this.polozen = polozen;
	}
	
	
}