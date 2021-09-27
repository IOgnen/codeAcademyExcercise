package UserData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserService {

	private final List<User> users = new ArrayList<>();

	public UserService(String csvPath) {

		try {
			List<String> lines = Files.readAllLines(Path.of(csvPath));

			for (int i = 1; i < lines.size(); i++) {
				String[] row = lines.get(i).split(";");

				Set<Role> roles = new HashSet<>();

				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate x = LocalDate.now();
				Gender y;
				Integer z;
				
				try {

					x = LocalDate.parse(row[6],myFormatObj);
				} catch (Exception e) {
					x = null;
				}

				try {
					y = Gender.valueOf(row[7]);
				} catch (Exception e) {
					y = null;
				}

				try {
					z = Integer.parseInt(row[9]);
				} catch (Exception e) {
					z = null;
				}

				if (row[4].equals(""))
					row[4] = null;
				if (row[5].equals(""))
					row[5] = null;

				for (String role : row[3].split(",")) {
					roles.add(Role.valueOf(role));
				}

				UserProfile userProfile = new UserProfile(row[4], row[5], x, y);

				users.add(new User(row[0], row[1], row[2], roles, userProfile, z));

			}

		} catch (IOException e) {
			System.err.println("Failed reading CSV file");
		}
	}

	public void PrintUsers() {

		for (User i : users) {
			System.out.println(i.toString());
		}

	}

	public User getByUsername(String userName) {

		for (User i : users) {

			if (i.getUsername().equals(userName)) {
				return i;
			}
		}
	return null;
	}

}