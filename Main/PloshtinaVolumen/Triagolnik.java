package PloshtinaVolumen;

public class Triagolnik extends Shape {
	
	int a;
	int b;
	int c;
	public Triagolnik(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getClassName() {
		return "Triagolnikot";
	}

	public String getSides() {
		String s = String.valueOf(a)+" "+String.valueOf(b)+ " "+String.valueOf(c);
		return s;
	}

	public int Ploshtina() {
		return (((a + b) / 2) * c);
	}

	public int Perimetar() {
		return a + b + c;
	}
}
