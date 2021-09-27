package ArraysExcercises;

import java.util.Scanner;

public class Excercise3 {

	public void exc3() {

		Scanner vnes = new Scanner(System.in);
		Integer k=0;
		Integer niza[] = { 23, 34, 5, 8, 3, 45, 756, 34, 123, 4, 2, 6, 7, 67 };
		
		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vnesete broj za proverka: ");
		Integer x = vnes.nextInt();

		for (int i = 0; i < niza.length; i++) {
			if (x == niza[i]) {
				k=1;
			}
		}
		if (k==1)
			System.out.println("Brojot: " +x+ " se sodrzi vo nizata");
		else
			System.out.println("Brojot: " +x+ " ne se sodrzi vo nizata");
	}
}
