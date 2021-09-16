package PloshtinaVolumen;

public class MainPlo {
	public static void main(String[] args) {

		int i;

		Shape[] Forma = new Shape[6];

		Forma[0] = new Triagolnik(3, 5, 6);
		Forma[1] = new Triagolnik(3, 4, 6);
		Forma[2] = new Triagolnik(5, 7, 6);
		Forma[3] = new Kvadrat(4, 5);
		Forma[4] = new Kvadrat(8, 5);
		Forma[5] = new Kvadrat(4, 2);

		for (i = 0; i < Forma.length; i++) {
			System.out.println(Forma[i].getClassName() + " so strani: " + Forma[i].getSides() + " e: "
					+ Forma[i].Ploshtina() + " a Perimetarot e: " + Forma[i].Perimetar());
		}
		

	}
} 
