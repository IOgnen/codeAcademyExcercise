package Mini;

import java.util.Arrays;
import java.util.Scanner;

public class Najgolemi_tri {

	public static void main (String[] args)throws NumberFormatException {
		
		System.out.print("Vnesete broj na clenovi na niza : ");
		
		Scanner vnes = new Scanner(System.in);
		int broj = vnes.nextInt();
		
		int x;
		int y = 0;
		int[] niza = new int[broj];
		
		for (x=0; x<niza.length ; x++) {
			
			Scanner brojce = new Scanner(System.in);
			niza[x] = brojce.nextInt();
				
		}
		
		System.out.print("Niza : ");
		
		for (x=0; x<niza.length ; x++) {
			
			System.out.print(niza[x]);
			
		}
		
		for (x=0; x<niza.length ; x++) {
			
			if(y < niza[x])
				y = niza[x];
				
		}
		
		System.out.println(y);
	}
}
