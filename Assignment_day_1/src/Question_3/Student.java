package Question_3;

import java.util.Objects;

public class Student {
	/*
	 * Q3/- Consider the following bean class:
Student:
roll: int
name: String
address: String
marks: int
● Create a List of 5 Student objects with proper details.
● Remove the duplicate Student object from the List.
● Sort the List of Students according to their marks, and if the marks are the same then
sort them according to their name.
● Print all the Student details from the List of Student object.
	 */
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}

	
	
	
	
	
	

}
