package Files;

public class Adress {

	private String city;
	private Integer number;
	private String street;
	
	public Adress() {
		super();
	}
	public Adress(String city, Integer number, String street) {
		super();
		this.city = city;
		this.number = number;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
}
