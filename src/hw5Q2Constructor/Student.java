package hw5Q2Constructor;

public class Student {

	public String stName;
	public int stID;
	public char stGender;
	public float grade;
	public boolean isProgrammer;

	public Student() { // Default Constructor Declared
		System.out.println("This is from the default Constructor of the student class");
	}

//Parameterized Constructor is declared
	public Student(String stName, int stID, char stGender, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stGender = stGender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name:" + stName + ",ID" + stID + ",Gender:" + stGender + ",Grade:" + grade
				+ ",Java Programmer?" + isProgrammer);

	}
}
