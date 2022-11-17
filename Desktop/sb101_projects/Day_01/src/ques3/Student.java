package ques3;

import java.util.Objects;

public class Student {

	private int roll;
	
	private String name;
	
	private String adress;
	
	private int marks;

	public Student(int roll, String name, String adress, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.adress = adress;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", adress=" + adress + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, marks, name, roll);
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
		return Objects.equals(adress, other.adress) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}
	
	
	
	
	
	
	
}
