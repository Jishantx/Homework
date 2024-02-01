package hw13Polymorphism;
/*When different methods exist with the same method name with same parameters or signature 
 * but with different syntax or logic, it is called method overriding. Method Overloading occurs 
 * during compile time.
*/

public class Neice extends Sister {

	@Override
	public void sister() {
		System.out.println("This is from void type method from Neice Class");

	}

	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 + age2 + 10;
		System.out.println("Total age of sister: " + total1);
	}

	@Override

	public int sister(int age1, int age2, int age3) {
		int total2 = age1 / 2 + age2 * 2 + age3 + 12;
		System.out.println("Total age of sister: " + total2);
		return total2;
	}

	/*
	 * @Override
	 * 
	 * public final int sister (int age1, int age2, int age3, int age4,int age5) {
	 * int total4 = age1/2+age2*8+age3+2+age4-1+age5/34; // local variable
	 * System.out.println("Total age of sister: " + total4); return total4; }
	 * 
	 * @Override
	 * 
	 * public static void sister (int age1, int age2, int age3, int age4,int
	 * age5,int age6) { int total5 = age1+age2+age3+age4+age5+age5+age6; // local
	 * variable System.out.println("Total age of sister: " + total5); }
	 */

}
