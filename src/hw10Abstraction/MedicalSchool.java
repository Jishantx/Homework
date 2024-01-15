package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * Medical School Extends NursingSchool= Here "extends" keyword is use for
	 * inheritance for Abstract Class. Abstract class can inherit another Abstract
	 * class using "extends" keyword. Abstract class can inherit another regular
	 * class or Interface by using "extends" keyword. only one inheritance is
	 * possible by abstract class.
	 */

	// abstract method
	public abstract void anatomyLab();

	// non-abstract method
	public void biochemstryLab() {
		System.out.println("This method is from MedicalSchool class");

	}

	public MedicalSchool() {
		// Default Constructor
		System.out.println("This constructor is from Abstract Class--MedicalSchool");
	}

}
