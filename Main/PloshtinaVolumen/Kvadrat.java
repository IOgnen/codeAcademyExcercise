package PloshtinaVolumen;

public class Kvadrat extends Shape {

	int a;
	int b;
	public Kvadrat(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public String getClassName() {
		return "Kvadratot";
	}
	
	public int Ploshtina() {
		return  a * b;
	}

	public int Perimetar() {
		return (2 * a) + (2 * b);
	}
	
	public String getSides() {
		String s = String.valueOf(a)+" "+String.valueOf(b);
		return s;
	}

}
