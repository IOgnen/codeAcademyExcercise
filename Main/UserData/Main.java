package UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {

		String CSV = "Main\\CSV.csv";
		BufferedReader reader = null;

		String line = "";
		String[] linija = null;
		ArrayList<User> site = new ArrayList<User>();
		int linecount = 0;

		try {
			reader = new BufferedReader(new FileReader(CSV));
			while ((line = reader.readLine()) != null) {
				
				if (linecount == 0) {
					linecount ++;
				}else {
				
				linija = line.split(";");

				ArrayList<String> row = new ArrayList<String>();

				for (int i = 0; i < linija.length; i++) {
					row.add(linija[i]);
				}
				
				
				User x = new User();
				x.username = row.get(0);
				x.password = row.get(1);
				x.email = row.get(2);
				x.Roles = row.get(3);
				x.setRoles();
				site.add(x);
				System.out.println(x.toString());
				System.out.println();
				}


			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
}
