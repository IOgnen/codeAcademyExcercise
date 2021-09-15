package Domasni;

public class Dog {
	public String Breed;
	public String Size;
	public Integer Age;
	public String Color;
	
	
	public String getBreed() {
		return Breed;
	}


	public void setBreed(String breed) {
		Breed = breed;
	}


	public String getSize() {
		return Size;
	}


	public void setSize(String size) {
		Size = size;
	}


	public Integer getAge() {
		return Age;
	}


	public void setAge(Integer age) {
		Age = age;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getInfo() {
		return "Dog breed: "+Breed+"\nDog color: "+Color+"\nDog age: "+Age+"\nDog Size: "+Size;
	}
	
}