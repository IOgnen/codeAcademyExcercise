package UserData;

import java.time.LocalDate;
import java.util.Set;

public class UserProfile {
	
	private String name;
	private String surname;
	private LocalDate birthDate;
	private Gender gender;
	
	public UserProfile(String name, String surname, LocalDate birthDate,Gender gender) {
		this.name=name;
		this.surname=surname;
		this.birthDate= birthDate;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate.toString();
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", gender=" + gender
				+ "]";
	}

	
}
