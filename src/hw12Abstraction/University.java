package hw12Abstraction;

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	default void gymnasium() { // Default method
		System.out.println("We ned women's only gymnisium");
	}

	static void library() { // Static method
		System.out.println("Hoover library has the best kids corner");
	}

	/*
	 * Interface inherits other interfaces by using the "extends" keyword. For
	 * example: University extends College,Hospital.
	 * 
	 * Interface inherits other interfaces by using "extends" keyword whereas
	 * classes use the "Implements" keyword to inherit an interface.
	 * 
	 * Interface cannot inherit a regular class or abstract class.
	 * 
	 * Interface can inherit multiple interfaces.
	 * Constructor is not allowed in Interface
	 * 
	 */

}
