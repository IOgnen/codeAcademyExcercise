package Mini;

import java.util.Arrays;
import java.util.Scanner;

public class IntNiza {
	public static void main(String[] args) {
		
		int broj;
		int x;
		int najgolem=0;
		int najmal=10000;
		
		
		System.out.print("Vnesete dolzina na niza: ");
		
		Scanner vnes = new Scanner(System.in);
		broj = vnes.nextInt();
		
		int y[] = new int[broj];
		
		System.out.print("Vnesete gi broevite: ");
		
		for(x=0 ; x<broj ; x++){
			y[x] = vnes.nextInt();
			
			if (najgolem < y[x])
				najgolem = y[x];
			
			if (najmal > y[x])
				najmal = y[x];
		}
		
		for(int i: y) {	
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		System.out.println("Najgolem broj e: " + najgolem);
		System.out.println("Najgolem broj e: " + najmal);
	
		Arrays.sort(y);
		
		System.out.print("Nagolemi 3 broevi se: ");
		
		for (x=broj-3 ; x<broj ; x++) {
			System.out.print(y[x]+ " ");
		}
	}
}
