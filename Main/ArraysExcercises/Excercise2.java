package ArraysExcercises;

public class Excercise2 {

	public void exc2() {

		Integer niza[] = { 67, 12, 32, 56, 67, 43, 32, 45, 45 };
		Integer suma = 0;
		Double avg = 0.0d;

		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < niza.length; i++) {
			suma = suma + niza[i];
		}

		avg = ((double) suma / niza.length);

		System.out.println("Sredna vrednost e: " + avg);

	}

}
