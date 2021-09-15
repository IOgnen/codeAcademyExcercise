package Mini;

import java.util.Scanner;

public class Faktoriel {
	public static void main(String[] args) {
		int x=0;
		int f=1;
		
		System.out.print("Vnesete broj za faktoriel");
		
		Scanner vnes = new Scanner(System.in);
		int y = vnes.nextInt();
		
		for (x=1 ; x<=y ; x++) {
			f = f * x;
		}
			
		System.out.print("Faktoriel od brojot: ");
		System.out.println(f);
	}
}