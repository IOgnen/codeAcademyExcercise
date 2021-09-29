package UserData;

import java.time.ZonedDateTime;
import java.util.Set;

public class User {

	private String username;
	private String password;
	private String email;
	private Set<Role> roles;
	private ZonedDateTime createdOn = ZonedDateTime.now();	
	private UserProfile userProfile;
	private Integer points;

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
	public String getRoles() {
		return roles.toString();
	}
	public ZonedDateTime getCreatedOn() {
		return createdOn;
	}
	public User(Set<Role> roles) {
		super();
		this.roles = roles;
	}
	
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public User(String username,String password, String email,Set<Role> role,UserProfile userProfile,Integer points) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.roles = role;
		this.userProfile=userProfile;
		this.points = points;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", roles=" + roles
				+ ", userProfile=" + userProfile + ", points=" + points + "]";
	}	
	
}
