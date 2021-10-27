package Files;

public class User {

	private String name;
	private String surname;
	private Adress adress;
	private String phone;
	private String email;

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", adress=" + adress + ", phone=" + phone + ", email="
				+ email + "]";
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String name, String surname, Adress adress, String phone, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.phone = phone;
		this.email = email;
	}

	public User() {
		super();
	}

}
