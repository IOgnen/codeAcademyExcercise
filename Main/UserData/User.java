package UserData;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class User {

	private String username;
	private String password;
	private String email;
	private String Roles;
	private String data;
	
	private String name;
	private String surname;
	
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
	public int getRoles() {
		return Role.hashCode();
	}
	public void setRoles(String roles) {
		this.Roles= roles;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setDate(String data) {
		this.data=data;
	}
	public String getDate() {
		return this.data.toString();
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
		return "User [username=" + username + ", password=" + password + 
				", email=" + email + ", Roles=" + Role + ", Name="+name+ ",Surname="+surname+",date="+ data + "]";
	};
	
	
}
