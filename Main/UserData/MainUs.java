package UserData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUs {
	public static void main(String[] args) throws IOException {

		String csvPath = "Main\\CSV.csv";

		UserService juzer = new UserService(csvPath);
		User x;
		List<User> y = new ArrayList<>();
		
		juzer.PrintUsers();
		
		y = juzer.searchByYear("1995");
		System.out.println(y.toString());
		
	}
}
