package ArraysExcercises;

import java.util.Scanner;

public class Excercise7 {
	
	public void exc7() {
	Scanner vnes = new Scanner(System.in);
	Integer niza[] = { 89, 78, 8, 4, 3, 45, 756, 34, 123, 13, 2, 34, 37, 67 };
	Integer niza1[] = new Integer[niza.length+1];
	
	for (int i = 0; i < niza.length; i++) {
		System.out.print(niza[i]+" ");
		niza1[i]= niza[i];
	}
	System.out.println("Vnesuvame broj 100 vo nizata na mesto od index: ");
	Integer x = vnes.nextInt();

	
	for (int i = x; i < niza1.length - 1; i++) {
		niza1[x] = 100;
		niza1[x+1] = niza[i];
	}
	for (int i = 0; i < niza1.length ; i++) {
		System.out.print(niza1[i]+" ");
	}
	System.out.println();
}
}
