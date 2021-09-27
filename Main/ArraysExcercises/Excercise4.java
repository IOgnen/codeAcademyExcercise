package ArraysExcercises;

import java.util.Scanner;

public class Excercise4 {

	public void exc4() {

		Scanner vnes = new Scanner(System.in);
		Integer niza[] = { 23, 34, 5, 8, 3, 45, 756, 34, 123, 4, 2, 6, 7, 67 };

		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i]+ " ");
		}

		System.out.println();
		System.out.print("Vnesete broj od nizata: ");
		Integer x = vnes.nextInt();
		
		for (int i = 0; i < niza.length; i++) {
			if (x == niza[i])
				System.out.println(i);
		}
	}
}
