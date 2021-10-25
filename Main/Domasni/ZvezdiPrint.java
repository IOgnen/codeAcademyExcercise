package Domasni;

public class ZvezdiPrint {
	
	public static void main(String[] args) {
		
		leftAlign('*');
		
	}
	
	public static void leftAlign(char x) {
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print(x);
			}
			System.out.println();
		}
		
	}

	public static void rightAlign(char x) {
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print(x);
			}
			System.out.println();
		}
		
	}
	
}
