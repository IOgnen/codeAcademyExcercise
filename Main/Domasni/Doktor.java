package Domasni;

public class Doktor {
	
	private int DoctorId;
	private String DoctorName;
	private String Sector;
	
	public void setDoctorId(int id) {
		this.DoctorId = id;
	}	
	
	public int getDoctorId() {
	return DoctorId;
	}
	
	public void setDoctorName(String name) {
		this.DoctorName = name;
	}	
	
	public String getDoctorName() {
	return DoctorName;
	}
	
	public void setSector(String sector) {
		this.Sector = sector;
	}	
	
	public String getSector() {
	return Sector;
	}
	
	public void Operacija(int x) {
		if (x>0)
			System.out.println("Uspeshna Operacija");
		else
			System.out.println("Neuspeshna Operacija");
	}
}
