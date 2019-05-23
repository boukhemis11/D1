package main;

public class Person {
	protected String name = "boukhemis";
	protected String lastName = "Dib";
	protected int age = 27;
	
	public Person() {

	}
	
	public Person(String name) {
		this.name = name;

	}
	
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;

	}
	
	public Person(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + " Last Name : " + getLastName() + " Age : " + getAge();
	}
	
	
}
