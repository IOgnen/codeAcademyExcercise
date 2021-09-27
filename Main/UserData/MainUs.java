package UserData;

import java.io.IOException;
import java.util.Scanner;

public class MainUs {
	public static void main(String[] args) throws IOException {

		Scanner vnes = new Scanner(System.in);
		String csvPath = "Main\\CSV.csv";
		int bara;

		UserService juzer = new UserService(csvPath);

		juzer.PrintUsers();
		
		System.out.println("Search use by: 1-email , 2-username");
		bara = vnes.nextInt();

		vnes.close();
	}
}
