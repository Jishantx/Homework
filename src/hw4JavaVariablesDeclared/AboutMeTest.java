package hw4JavaVariablesDeclared;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe jishan = new AboutMe ();//Constructor Initialized
		jishan.myName = "Jishan Karishma Zaman";
		jishan.myAge = 53;
		jishan.myTuitionfee=2000;
		jishan.myYearlytuitionfee=10000;
		jishan.myBankBalance=50000;
		jishan.myHeight= 5.4f;
		jishan.myGrade=4.00;
		jishan.myGender='F';
		jishan.fullTimeStudent= true;
		jishan.aboutMe();//method initialized
		
		AboutMe alex= new AboutMe ();//Constructor created
		alex.myName = "alex omar khan";
		alex.myAge = 45;
		alex.myTuitionfee=5000;
		alex.myYearlytuitionfee=50000;
		alex.myBankBalance=1000000;
		alex.myHeight= 5.4f;
		alex.myGrade=3.89;
		alex.myGender='M';
		alex.fullTimeStudent= true;
		alex.aboutMe();//method initialized
		
		
		
	}
}
