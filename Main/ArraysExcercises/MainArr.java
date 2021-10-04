package ArraysExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainArr {

	public static void main(String[] args) {

		Integer niza[] = { 67, 12, 32, 56, 67, 43, 32, 45, 45 };
		Integer nizaBroj[] = { 87, 459, 785, 25, 69, 785, 459, 875, 368, 69, 25, 875, 671, 555 };
		String nizaZbor[] = { "Google", "Doodle", "Hoodie", "Spooky", "Doodle", "Google", "Medo", "Bruno" };
		String nizaZbor1[] = { "Fejsbuk", "Mejsbuk", "Google", " Doodle", "Moogle", "Hoodie" };

		List<Integer> nizaInteger = new LinkedList<Integer>(Arrays.asList(nizaBroj));
		List<String> nizaZborovi = Arrays.asList(nizaZbor);
		List<String> nizaZborovi1 = Arrays.asList(nizaZbor1);

		brojSamoglaski(nizaZborovi);
//		System.out.println(exc7(nizaBroj));
//		System.out.println(exc6(nizaInteger));
//		System.out.println(exc5(nizaBroj));
//		System.out.println(exc4(nizaInteger));
//		System.out.println(exc12(nizaInteger));
//		System.out.println(exc13(nizaZborovi));
//		System.out.println(exc14(nizaZborovi, nizaZborovi1));
//		System.out.println(exc16(nizaInteger));
//		System.out.println(exc22(nizaInteger));

	}

	public static void brojSamoglaski(List<String> niza) {

		Integer a = 0, e = 0, i = 0, o = 0, u = 0;
		Integer total = 0;
		char y;

		for (String x : niza) {

			for (int j = 0; j < x.length(); j++) {

				y = x.charAt(j);
				if ((y == 'a') || (y == 'A')) {
					a++;
					total++;
				}
				if ((y == 'e') || (y == 'E')) {
					e++;
					total++;
				}
				if ((y == 'i') || (y == 'I')) {
					i++;
					total++;
				}
				if ((y == 'o') || (y == 'O')) {
					o++;
					total++;
				}
				if ((y == 'u') || (y == 'U')) {
					u++;
					total++;
				}
				

			}
			System.out.println(x.toString()+ " - sodrzi " + " a: " + a + " e: " + e + " i: " + i + " o: " + o + " u: " + u);
			System.out.println("Total samoglaski: "+ total);
		}

	}

	public static List<Integer> exc7(Integer[] niza) {

		Scanner vnes = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();

		System.out.println("Vnesuvame broj 100 vo nizata na mesto od index: ");
		Integer x = vnes.nextInt();
		int k = 0;

		for (int i = 0; i < niza.length; i++) {

			result.add(niza[i]);

		}

		result.add(x, 100);
		return result;

	}

	public static List<Integer> exc6(List<Integer> niza) {

		List<Integer> result = niza;
		List<Integer> temp = new ArrayList<>();

		for (int i = 0; i < result.size(); i++) {
			Integer x = (niza.get(i));
			temp.add(x);

		}
		return temp;
	}

	public static List<Integer> exc5(Integer niza[]) {
		Scanner vnes = new Scanner(System.in);

		System.out.print("Vnesete index da se izbrishe [0 - " + niza.length + "] : ");
		Integer x = vnes.nextInt();

		for (int i = x; i < niza.length - 1; i++) {
			niza[i] = niza[i + 1];
		}
		return Arrays.asList(niza);
	}

	public static Double exc4(List<Integer> niza) {

		Integer suma = 0;
		Double avg = 0.0d;

		for (int i = 0; i < niza.size(); i++) {
			suma = suma + niza.get(i);
		}

		avg = ((double) suma / niza.size());

		return (avg);

	}

	public static List<Integer> exc12(List<Integer> niza) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < niza.size() - 1; i++) {

			for (int j = i + 1; j < niza.size(); j++) {

				if (niza.get(i).equals(niza.get(j))) {
					result.add(niza.get(i));
				}
			}
		}
		return result;

	}

	public static List<String> exc13(List<String> niza) {

		List<String> result = new ArrayList<>();

		for (int i = 0; i < niza.size() - 1; i++) {

			for (int j = i + 1; j < niza.size(); j++) {

				if (niza.get(i).equals(niza.get(j))) {
					result.add(niza.get(i));
				}
			}

		}

		return result;

	}

	public static List<String> exc14(List<String> niza, List<String> niza1) {

		List<String> result = new ArrayList<>();

		for (int i = 0; i < niza.size(); i++) {

			for (int j = 0; j < niza1.size(); j++) {

				if (niza.get(i).equals(niza1.get(j))) {
					if (result.contains(niza.get(i))) {

					} else
						result.add(niza.get(i));
				}
			}

		}

		return result;
	}

	public static List<Integer> exc16(List<Integer> niza) {

		for (int i = 0; i < niza.size() - 1; i++) {

			for (int j = i + 1; j < niza.size(); j++) {

				if (niza.get(i).equals(niza.get(j))) {

					niza.remove(i);

				}
			}

		}

		return niza;

	}

	public static void exc22(List<Integer> niza) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < niza.size() - 1; i++) {

			if ((niza.get(i) + niza.get(i + 1)) == 94 || (niza.get(i) + niza.get(i + 1)) == 1244) {

				System.out.println("Parovi : " + i + " - " + (i + 1));
			}

		}

	}
}
