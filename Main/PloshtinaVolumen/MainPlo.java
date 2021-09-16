package PloshtinaVolumen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPlo {
	public static void main(String[] args) {
		
		List<Shape> forms = new ArrayList();
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			forms.add(new Triagolnik(r.nextInt(10),r.nextInt(10),r.nextInt(10)));
		}
		
		
		forms.forEach(forma -> {
			System.out.println(forma.getClassName() + " so strani: " + forma.getSides() + " e: "
					+ forma.Ploshtina() + " a Perimetarot e: " + forma.Perimetar());
		});
		
		
		/*
		for (i = 0; i < Forma.length; i++) {
			System.out.println(Forma[i].getClassName() + " so strani: " + Forma[i].getSides() + " e: "
					+ Forma[i].Ploshtina() + " a Perimetarot e: " + Forma[i].Perimetar());
		}
		*/

	}
} 
