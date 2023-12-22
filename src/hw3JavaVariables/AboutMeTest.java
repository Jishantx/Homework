package hw3JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();//Constructor initialized here
		
		System.out.println(aboutMe.myName);
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.myTuitionfee);
		System.out.println(aboutMe.myYearlytuitionfee);
		System.out.println(aboutMe.myBankBalance);
		System.out.println(aboutMe.myHeight);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.myGender);
		System.out.println(aboutMe.fullTimeStudent);
		
		//Calling all Variables
		
		System.out.println("My Name: " + aboutMe.myName + "\nMy Age: " + aboutMe.myAge + "\nMy tuition fee: "
				+ aboutMe.myTuitionfee + "\nmy yearly tuition fee: " + aboutMe.myYearlytuitionfee + "\nMy Bank Balance: "
				+ aboutMe.myBankBalance + "\nmy Gender: " + aboutMe.myGender + "\nMy Grade: " + aboutMe.myGrade + "\nAm I a fulltime student? Ans: " + aboutMe.fullTimeStudent);
	}

}
