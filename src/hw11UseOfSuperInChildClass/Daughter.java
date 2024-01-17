package hw11UseOfSuperInChildClass;

//Child/Sub Class: Daughter, Parent/Base/Super Class: Father
public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		//super(); Super can call default constructor from Parent Class
		//Here I am using super to call parameterized constructor from Parent Class
		super("Farruk Kabir",43,'M',true);
		
		//super keyword is used to call any types of method from super class
		super.father();
		super.fatherInfo("January", 54, 'F', true);
		super.fatherInfo("June", 29, 'M', false);
		
		//Super keyword is also used to initialize the variables from the parent class
		
		super.familyName="Zaman";
		
		System.out.println("Our family name is Zaman");
		
		System.out.println("This Default Constructor is from Daughter Class");
	}
    //Parameterized Constructor
	////Inside parameterized constructor, super() and super keyword do same function like they did inside default constructor
	public Daughter(String birthMonth, int age) {
		
		//super();
		super("February", 12, 'M', true);
		
		super.father();
		super.fatherInfo("Rashna", 28, 'M', true);
		
		super.familyName="Hossain";
		System.out.println("Rashna's family name is Hossain");
		
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birth Month :" + birthMonth + ", Age:" + age);
	}

	public void daughter() {
		System.out.println(" This method is from Daughter Class");
	}

	public void daugherInfo(String birthMonth, int age) {

		System.out.println("Birth Month :" + birthMonth + ", Age:" + age);

	}
}
