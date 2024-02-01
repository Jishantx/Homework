package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity colu = new ColumbiaUniversity();
		University uni = new ColumbiaUniversity();
		MedicalSchool medicalSchool = new ColumbiaUniversity();

		colu.biology();
		colu.classSize();
		colu.anatomyLab();
		colu.playGround();
		colu.teacher();
		colu.vocationalInfo();
		colu.commonRoom();
		colu.laboratory();
		colu.languageClub();
		colu.languageClub();
		colu.emergencyRoom();
		colu.surgeryRoom();
		colu.cafeteria();
		colu.lawInfo();
		colu.hygiene();
		colu.biochemstryLab();
		colu.maths();
		colu.aeronauticalInfo();
		colu.mechanicalLab();
		colu.caring();
		colu.anthropology();
		colu.dorm();
		colu.morgue();

		uni.gymnasium();
		uni.cafeteria();
		uni.morgue();
		uni.classSize();
		University.library();
		uni.dorm();
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.playGround();
		uni.teacher();
		uni.languageClub();

		medicalSchool.biochemstryLab();
		medicalSchool.mechanicalLab();
		medicalSchool.anatomyLab();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();

	}

}
