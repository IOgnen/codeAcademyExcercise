package UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UserService {

	private final List<User> users = new ArrayList<>();

	public UserService(String csvPath) {

//		BuffreaReader za chitanje od file
		try (BufferedReader br = new BufferedReader(new FileReader(csvPath));) {

			List<String> lines = new ArrayList<>();
			String line;
			
			while ((line = br.readLine()) != null) {

				lines.add(line);

			}

			for (int i = 1; i < lines.size(); i++) {

				String[] row = lines.get(i).split(";");

				System.out.print(row[0]);
				
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate x = LocalDate.now();

				Set<Role> roles = new HashSet<>();
				Gender y;
				Integer z;

				try {
					x = LocalDate.parse(row[6], myFormatObj);
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

	public User getByEmail(String email) {

		for (User i : users) {

			if (i.getEmail().equals(email)) {
				return i;
			}
		}
		return null;
	}

	public List<User> searchByRole(String roles) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			if (i.getRoles().contains(roles)) {
				searchResult.add(i);
			}
		}

		return searchResult;
	}

	public List<User> searchByYear(String year) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			if (i.getUserProfile() != null) {
				if (i.getUserProfile().getBirthDate() != null) {
					String theYear = i.getUserProfile().getBirthDateString();
					if (theYear.contains(year)) {
						searchResult.add(i);
					}
				}

			}
		}
		return searchResult;

	}

	public List<User> searchByGender(Gender gender) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			if (i.getUserProfile() != null) {
				if (i.getUserProfile().getGender() != null) {
					if (i.getUserProfile().getGender().equals(gender)) {
						searchResult.add(i);
					}
				}
			}
		}
		return searchResult;

	}

	public List<User> searchByEmailDomain(String domain) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			if (i.getEmail().contains(domain)) {
				searchResult.add(i);
			}
		}
		return searchResult;
	}

	public List<User> searchByNameSurname(String name) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			String fullname = i.getUserProfile().getName() + i.getUserProfile().getSurname();
			if (fullname.contains(name))
				searchResult.add(i);
		}
		return searchResult;
	}

	public List<User> searchByPoints(Integer points) {

		List<User> searchResult = new ArrayList<>();

		for (User i : users) {
			if (i.getPoints().equals(points)) {

			}
		}

		return searchResult;

	}

	public void addToDb(List<User> users) {
		
		
		
	}

}
