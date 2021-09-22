package UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class User {

	String username;

	String password;
	String email;
	String Roles;
	Set<String> Role = new HashSet<String>();

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setRoles(){
		String pomoshna = this.Roles;
		if (pomoshna.contains("ADMIN")&&(pomoshna.contains("USER"))) {
			Role.add("ADMIN");
			Role.add("USER");
		}else if (pomoshna.contains("ADMIN")) {
			Role.add("ADMIN");
		}else if (pomoshna.contains("USER")){
			Role.add("USER");
		}
		
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", Roles=" + Role + "]";
	};
	
	
}
