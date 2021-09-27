package ArraysExcercises;

import java.util.Scanner;

public class Excercise5 {

	public void exc5() {
		Scanner vnes = new Scanner(System.in);
		Integer niza[] = { 23, 34, 5, 8, 3, 45, 756, 34, 123, 4, 2, 6, 7, 67 };

		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i]+" ");
		}
		System.out.println();
		System.out.print("Vnesete index da se izbrishe [0 - " + niza.length+"] : ");
		Integer x = vnes.nextInt();

		
		for (int i = x; i < niza.length - 1; i++) {
			niza[i] = niza[i + 1];
		}
		for (int i = 0; i < niza.length - 1; i++) {
			System.out.print(niza[i]+" ");
		}
		System.out.println();
	}
}
