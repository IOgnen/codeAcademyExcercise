package UserData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUs {
	public static void main(String[] args) throws IOException {

		String csvPath = "Main\\CSV_User.csv";

		UserService juzer = new UserService(csvPath);

		List<User> y = new ArrayList<>();

		juzer.PrintUsers();

		y = juzer.searchByGender(Gender.MALE);
		System.out.println(y.toString());

	}
}
