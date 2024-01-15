package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * Here "extends" keyword is used for inheritance. Regular class can inherit
	 * another regular class or abstract class using "extends" keyword. It can
	 * inherit from Interface using "implements" keyword. Multiple inheritance is
	 * not allowed for regular class for inheritance.
	 * Regular class can inherit only one one regular or abstract class.
	 */

	// public abstract void chemistry();
	// Abstract method is not possible here as it is a regular class

	public void biology() {
		System.out.println("This method is from ColumbiaUniversity class");
	}

	public ColumbiaUniversity() {

		System.out.println("Default Constructer from ColumbiaUniversity class");

	}

}









public class ColumbiaUniversity {

	//public abstract void chemistry(); 
	//Abstract method is not possible here as it is a regular class
	
	public void biology() {
		System.out.println("This method is from ColumbiaUniversity class");
	}
	
	public ColumbiaUniversity () {
		
		System.out.println("Default Constructer from ColumbiaUniversity class");
		
	}
		
	
}
