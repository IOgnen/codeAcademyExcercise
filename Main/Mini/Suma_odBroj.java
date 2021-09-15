package Mini;
import java.util.Scanner;

public class Suma_odBroj {
	 
	public static void main(String[] args) {
		
	
		
			int desetki = 0;
			int sitno = 0;
			int celo = 0;
		
			System.out.println("Vnesete broj : ");
			Scanner Broj = new Scanner(System.in);
			int Brojot = Broj.nextInt();
			
			desetki = Brojot / 10;
			
			sitno = Brojot % 10;
			
			celo = desetki + sitno;
			
			System.out.println(celo);
		}
	}
