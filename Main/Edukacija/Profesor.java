package Edukacija;

public class Profesor {
	
	String name;
	SubjectNames subject;
	String email;
	
	@Override
	public String toString() {
		return "Profesor [name=" + name + ", subject=" + subject + ", email=" + email + "]";
	}

	public Profesor() {
		super();
	}

	public Profesor(String name, SubjectNames subject, String email) {
		super();
		this.name = name;
		this.subject = subject;
		this.email = email;
	}
	

}
