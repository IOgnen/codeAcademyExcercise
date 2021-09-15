package Besilka;

import java.util.Scanner;

public class Back {
	public int Zivoti;
	public String Zbor;
	public String Nov = "";
	public int i;
	public int x;
	public char bukva;

	public void start() {
		Scanner vnes = new Scanner(System.in);

		System.out.print("Vneste broj na zivoti: ");
		x = vnes.nextInt();

		Back besilka = new Back();

		besilka.setZivoti(x);

		System.out.print("Vnesete zbor: ");
		Zbor = vnes.next();

		besilka.setZbor(Zbor);
		besilka.novZbor();

		while (true) {

			System.out.print("Vnesete bukva: ");
			bukva = vnes.next().charAt(0);

			besilka.Proverka(bukva);

			if (besilka.Zivoti == 0)
				break;
			
		}
		vnes.close();
	}

	public void setZivoti(int x) {
		this.Zivoti = x;
	}

	public void setZbor(String y) {
		this.Zbor = y;
		this.Zbor = Zbor.toLowerCase();
	}

	public void novZbor() {
		for (i = 0; i < Zbor.length(); i++) {
			Nov = Nov + "_";
		}
	}

	public void Proverka(char z) {
		if (Zbor.indexOf(z) == -1) {
			--Zivoti;
			System.out.println("Preostanati zivoti: " + Zivoti);
		} else {
			for (i = 0; i < Zbor.length(); i++) {
				if (z == Zbor.charAt(i)) {
					if (z == Nov.charAt(i)) {
						System.out.println("Veke vnesena bukva");
						break;
					} else
						Nov = Nov.substring(0, i) + z + Nov.substring(i + 1, Zbor.length());
				}
			}
			System.out.println(Nov);
		}
	}
	
	
}
