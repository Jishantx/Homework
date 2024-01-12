package hw8Abstraction;

public abstract class MedicalSchool {
	
		
	//abstract method
	public abstract void anatomyLab();
	
	//non-abstract method
	
	public void biochemstryLab() { 
		System.out.println("This method is from MedicalSchool class");
	
	}
		public MedicalSchool() {
			//Default Constructor
			System.out.println("This constructor is from Abstract Class--MedicalSchool");	
	}

}
