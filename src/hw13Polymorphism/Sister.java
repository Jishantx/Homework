package hw13Polymorphism;
/*When different methods exist with the same method name 
 * but with different parameters or signature, it is called method overloading. 
 * Method Overloading occurs during compile time.
 */

public class Sister {
	// void type non parameterized method (1) is implemented

	public void sister() {
		System.out.println("This is from void type method from Sister Class");
	}

	// void type parameterized method (2) implemented
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total age of sister: " + total1);
	}

	// return type parameterized method (3) implemented
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age of sister: " + total2);
		return total2;
	}

	// Return type parameterized method (4) which is final type and implemented

	public final int sister(int age1, int age2, int age3, int age4, int age5) {
		int total4 = age1 + age2 + age3 + age4 + age5; // local variable
		System.out.println("Total age of sister: " + total4);
		return total4;
	}

	// Static type Method (7) implemented

	public static void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total5 = age1 + age2 + age3 + age4 + age5 + age5 + age6; // local variable
		System.out.println("Total age of sister: " + total5);
	}

}
