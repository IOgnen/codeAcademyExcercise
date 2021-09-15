package Mini;

public class Delivi_Brojki {
	public static void main (String[] args)throws NumberFormatException {
		
		int x;
		
		System.out.println("Delivi so 3 se:");
		for(x=1; x<100 ; x++) {
			if (x%3==0) {
				System.out.print(x + " " );
			}
		}
		System.out.println("Delivi so 5 se:");
		for(x=1; x<100 ; x++) {
			if (x%5==0)
				System.out.print(x + " ");
		}
		System.out.println("Delivi so 5 i 3 se:");
		for(x=1; x<100 ; x++) {
			if  (x%5==0 && x%3==0)
				System.out.print(x + " ");
		}
		
	}
}
