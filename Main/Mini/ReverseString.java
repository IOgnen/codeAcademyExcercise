package Mini;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		int x;
		char nov;
		String zbor = "";

		Scanner vnes = new Scanner(System.in);

		while (zbor != "stop") {

			if (zbor.equals("stop")) {
				System.exit(1);

				zbor = vnes.next();

				System.out.println("Broj na karakteri: " + zbor.length());

				for (x = 0; x < zbor.length(); x++) {
					nov = zbor.charAt(x);
				}

				for (x = zbor.length() - 1; x >= 0; x--) {

					nov = zbor.charAt(x);
					System.out.print(nov);
				}

			}
		}

	}
}
