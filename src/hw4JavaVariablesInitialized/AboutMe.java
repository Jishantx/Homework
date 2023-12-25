package hw4JavaVariablesInitialized;

public class AboutMe {

	public String Name;// Variable is declared
	public String myName = "Ayesha Fatima";// Variable is initialized
	public byte myAge = 24;
	public short myTuitionfee = 1000;
	public int myYearlytuitionfee = 23000;
	public long myBankBalance = 6587675l;
	public float myHeight = 6.2f;
	public double myGrade = 4.00;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;

	public AboutMe() {
		// Constructor is declared
		System.out.println(":.......This is all about Myself......:");

	}

//	Method implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy tuition fee: " + myTuitionfee
				+ "\nmy yearly tuition fee: " + myYearlytuitionfee + "\nMy Bank Balance: " + myBankBalance
				+ "\nmy Gender: " + myGender + "\nMy Grade: " + myGrade + "\nAm I a fulltime student? Ans: "
				+ fullTimeStudent);

	}

}
