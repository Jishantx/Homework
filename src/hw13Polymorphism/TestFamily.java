package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("-----Sister Class----");
		Sister sister = new Sister();
		
		sister.sister();// void type method 01 initialized
		sister.sister(10, 11);//void type parameterized method 02 initialized
		sister.sister(5, 3, 7);// return type parameterized method 03 initialized
		sister.sister(11, 13, 18, 14, 30);// Return type parameterized method 04 which is final type and initialized
		Sister.sister(9, 1, 5, 9, 11, 19);// Static type Method 05 initialized
		
		
		System.out.println("-----Neice Class----");
		Neice neice =new Neice ();
		
		neice.sister();// void type method 01 initialized
		neice.sister(7, 0);//void type parameterized method 02 initialized
		neice.sister(8, 9, 3);// return type parameterized method 03 initialized
		
	}
}

