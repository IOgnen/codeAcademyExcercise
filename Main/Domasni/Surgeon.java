package Domasni;

public class Surgeon extends Doktor {
	
	String pol;	
	
	public void Operacija(int x,int z) {
		if (z<0)
			System.out.println("Uspeshna Operacija");
		else
			System.out.println("Neuspeshna Operacija");
	}
		
}
