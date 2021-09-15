package Mini;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		
		int vkupno =0;
		int samoglaski = 0;
		int broj=0;
		int i;
		Scanner vnes = new Scanner(System.in);
		
		System.out.print("Vnsete golemina na niza: ");
		
		broj = vnes.nextInt();
		
		String[] niza = new String[broj];
		
		System.out.println("Dolzina na niza: " + niza.length );
		
		for (i=0 ; i<broj ; i++) {
			System.out.print(i+1 + "-viot clen: ");
			niza[i]=vnes.next();
			
			int s = niza[i].length();
			
			for (int x=0 ; x<s; x++){
				char bukva = niza[i].charAt(x);
				 if(bukva == 'A' || bukva == 'a' 
			                || bukva == 'I' || bukva == 'i' 
			                || bukva == 'O' || bukva == 'o' 
			                || bukva == 'U' || bukva == 'u')
				 {
					 samoglaski = samoglaski+1;
					 vkupno = samoglaski;
				 }
			}
			System.out.println("Ima "+ samoglaski + " samoglaski, vkupno:"+vkupno);
			samoglaski = 0;
		}
			
		System.out.print("Niza: ");
		
		Arrays.sort(niza);

		for (String s : niza) {
			System.out.print(s + " ");			
		}
	}
}