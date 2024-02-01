package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool {
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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}










