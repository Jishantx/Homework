package hw4JavaVariablesDeclared;

public class AboutMe {
	public String myName; //Variable Initialized
	public byte myAge;
	public short myTuitionfee; 
	public int myYearlytuitionfee; 
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean fullTimeStudent;
		// Constructor declared
		public AboutMe() {
			System.out.println("This is all about us");
		}
		
		public void aboutMe() { //method implemented
			
			System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy tuition fee: " + myTuitionfee
					+ "\nmy yearly tuition fee: " + myYearlytuitionfee + "\nMy Bank Balance: " + myBankBalance
					+ "\nmy Gender: " + myGender + "\nMy Grade: " + myGrade + "\nAm I a fulltime student? Ans: "
					+ fullTimeStudent);
			
		}
			
		}

