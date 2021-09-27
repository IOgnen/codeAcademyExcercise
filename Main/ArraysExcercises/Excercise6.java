package ArraysExcercises;

import java.util.Scanner;

public class Excercise6 {

	public void exc6() {

		Integer niza[] = { 51, 6, 34, 76, 12, 18, 658, 987, 123, 4, 63, 6, 46, 67 };
		Integer niza2[] = new Integer[niza.length];

		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i] + " ");
			niza2[i] = niza[i];
		}
		System.out.println();
		System.out.println("Nova niza");
		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza2[i] + " ");
		}
		System.out.println();
	}

}
