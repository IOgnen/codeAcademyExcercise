package Domasni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListExcercise {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();

		lista.add(65);
		lista.add(128);
		lista.add(589);
		lista.add(24);
		lista.add(2);
		lista.add(4578);
		lista.add(9652);
		lista.add(8453);
		lista.add(159);
		lista.add(8);
		lista.add(76);

		ArrayList<Integer> digitCount = new ArrayList<>();

		digitCount = countDigits(lista);

		System.out.println(digitCount);

		HashSet<String> sameDigit = new HashSet<>();

		sameDigit = sameDigits(digitCount);

		System.out.println(sameDigit);
		
		ArrayList<Integer> parniBroevi = new ArrayList<>();
		
		parniBroevi = parni(lista);
		
		System.out.println(parniBroevi + " ima: " + parniBroevi.size()+" broevi");
		
		ArrayList<Integer> neparniBroevi = new ArrayList<>();
		
		neparniBroevi = neParni(lista);
		
		System.out.println(neparniBroevi + " ima: " + neparniBroevi.size()+" broevi");
		
		

	}

	public static ArrayList<Integer> countDigits(ArrayList<Integer> lista) {

		ArrayList<Integer> result = new ArrayList<>();
		Integer counter = 0;

		for (Integer broj : lista) {

			do {

				broj = broj / 10;
				counter++;

			} while (broj != 0);

			result.add(counter);
			counter = 0;

		}

		return result;

	}

	public static HashSet<String> sameDigits(ArrayList<Integer> lista) {

		HashSet<String> result = new HashSet<>();
		Integer counter = 0;

		for (Integer broj : lista) {

			for (int i = 0; i < lista.size(); i++) {

				if (broj == lista.get(i)) {
					counter++;
				}

			}
			result.add(broj + "- cifreni broevi ima: " + counter);
			counter = 0;
		}

		return result;

	}

	public static ArrayList<Integer> parni(ArrayList<Integer> lista) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(Integer broj: lista) {
			
			if (broj%2==0) {
				result.add(broj);
			}
		
		}
		
		return result;
		
	}
	
	public static ArrayList<Integer> neParni(ArrayList<Integer> lista){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(Integer broj : lista) {
			
			if(broj%2==1) {
				result.add(broj);
			}
		}
		
		return result;
		
	}
	
}
