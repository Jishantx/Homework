package hw14Abstraction;

public class TestInstitute {
	
	public static void main(String[] args) {
		System.out.println("----From Columbia University----");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		
		columbiaUniversity.biology();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.languageClub();
	
		
		// Can not Instantiate University as it is an Interface 
		// Can not Instantiate MedicalSchool as it is an Abstract Class
		
		
		
		
		
		
	}

}
