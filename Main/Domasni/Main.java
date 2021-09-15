package Domasni;

public class Main {
	public static void main(String[] args) {
		Dog maltese = new Dog();
		
		maltese.setBreed("JackRusel");
		maltese.setSize("Small");
		maltese.setColor("white");
		maltese.setAge(13);
		
		String r = maltese.getInfo();
		
		System.out.println(r);
		
		Surgeon dok = new Surgeon();
		
		dok.setDoctorId(134);
		dok.setDoctorName("Perica");
		dok.setSector("Ortoped");
		
		int x = 1;
		int z = 2; 
		
		dok.Operacija(x);
		
		dok.Operacija(x,z);
	
	
	}
}
