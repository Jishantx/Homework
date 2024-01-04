package hw6Methods;


public class FullName {
	
	public String fullName(String fName, String lName) {
		System.out.println("Family Member:"+fName+" "+lName);
		return null;	
	}
	
	public static void main(String[] args) {
		
		FullName fullName= new FullName();
		String familyMemberName1= fullName.fullName("Ibraheem","Kabir");
		String familyMemberName2= fullName.fullName("Abdullah","Kabir");
		String familyMemberName3= fullName.fullName("Maryam","Kabir");
		String familyMemberName4= fullName.fullName("Muhammad","Kabir");
			
		
		
		
		
	}
}
