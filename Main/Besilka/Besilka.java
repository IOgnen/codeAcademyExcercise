package Besilka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Besilka {
	public int zivoti;
	public String zborot;
	public List<Character> nov = new ArrayList<>();
	public List<Character> zbor = new ArrayList<>();
	public int i;
	public char bukva;

	public void start() {
		Scanner vnes = new Scanner(System.in);

		System.out.println("Zivoti: 10");

		Besilka besilka = new Besilka();

		besilka.setZivoti(10);

		System.out.print("Vnesete zbor: ");
		zborot = vnes.next();

		besilka.setZbor(zborot);
		besilka.novZbor();
		besilka.setZborot(zborot);

		while (true) {

			System.out.print("Vnesete bukva: ");
			bukva = vnes.next().charAt(0);

			besilka.Proverka(bukva);

			if (besilka.zivoti == 0)
				break;

		}
		vnes.close();
	}

	public void setZivoti(int x) {
		this.zivoti = x;
	}

	public void setZbor(String y) {
		this.zborot = y.toLowerCase();
	}

	public void novZbor() {

		for (i = 0; i < zborot.length(); i++) {
			nov.add('_');
		}
	}

	public void setZborot(String z) {
		for (i = 0; i < zborot.length(); i++) {
			zbor.add(zborot.charAt(i));
		}

	}

	public void Proverka(char z) {
		if (zborot.indexOf(z) == -1) {
			--zivoti;
			System.out.println("Preostanati zivoti: " + zivoti);
		} else {
			for (i = 0; i < zborot.length(); i++) {

				if (z == zborot.charAt(i)) {

					if (nov.get(i).equals(z)) {

						System.out.println("Veke vnesena bukva");
						break;
					} else
						nov.set(i, z);
				}

			}
			System.out.println("-----------------------------------------------------");
			System.out.print("[");
			for (Character x : nov) {
				System.out.print(x);
			}
			System.out.println("]");
			System.out.println("-----------------------------------------------------");
		}

		if (zbor.equals(nov)) {
			System.out.println("Pogodok!");
			System.exit(1);
		}
	}

}