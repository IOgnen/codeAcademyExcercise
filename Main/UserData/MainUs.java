package UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainUs {
	public static void main(String[] args) throws IOException {

		String CSV = "Main\\CSV.csv";
		BufferedReader reader = null;

		String srch;
		String line = "";
		String[] linija = null;
		String bara = "";
		int linecount = 0;

		ArrayList<User> site = new ArrayList<User>();

		Scanner vnes = new Scanner(System.in);

		try {
			reader = new BufferedReader(new FileReader(CSV));
			while ((line = reader.readLine()) != null) {

				if (linecount == 0)
					linecount++;
				else {

					linija = line.split(";");

					ArrayList<String> row = new ArrayList<String>();

					for (int i = 0; i < linija.length; i++) {
						row.add(linija[i]);
					}

					User x = new User();
					x.setUsername(row.get(0));
					x.setPassword(row.get(1));
					x.setEmail(row.get(2));
					x.setRoles(row.get(3));
					x.setName(row.get(4));
					x.setSurname(row.get(5));
					x.setDate(row.get(6));
					
					x.setRoles();
					site.add(x);
					System.out.println(x.toString());
				}
			}
			System.out.println("Search use by: 1-email , 2-username");
			bara = vnes.nextLine();

			for (User i : site) {

				if (i.getUsername().equals(bara)) {
					System.out.println("Userot e: " + i.toString());
				} else if (i.getEmail().equals(bara)) {
					System.out.println("Userot e:" + i.toString());
				}
			}
			srch = vnes.nextLine();

			for (User i : site) {
				if(i.getName() != null && i.getName().contains(srch) || i.getSurname()!= null && i.getSurname().contains(srch)) {
					System.out.println("Userot e: "+ i.toString());
				}else if(i.getEmail().contains(srch)) {
					System.out.println("userot e: "+ i.toString());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
		vnes.close();
	}
}
