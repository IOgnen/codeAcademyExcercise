package ArraysExcercises;

import java.util.Scanner;

public class MainArr {
	public static void main(String[] args) {

		Scanner vnes = new Scanner(System.in);
		Integer brojZadaca;

		// pocnuvaat od treta zadaca!!
		Excercise1 prva = new Excercise1();
		Excercise2 vtor = new Excercise2();
		Excercise3 tret = new Excercise3();
		Excercise4 chet = new Excercise4();
		Excercise5 pett = new Excercise5();
		Excercise6 shes = new Excercise6();
		Excercise7 sedu = new Excercise7();

		brojZadaca = 100;
		System.out.println("Vnesete 0 za kraj");

		while (brojZadaca != 0) {
			System.out.print("Vnesete broj na zadaca [3 - 21] : ");
			brojZadaca = vnes.nextInt();
			switch (brojZadaca) {
			case 3:
				prva.exc1();
				break;
			case 4:
				vtor.exc2();
				break;
			case 5:
				tret.exc3();
				break;
			case 6:
				chet.exc4();
				break;
			case 7:
				pett.exc5();
				break;
			case 8:
				shes.exc6();
				break;
			case 9:
				sedu.exc7();
				break;
			}
			
		}
		System.out.println();
	}
}
