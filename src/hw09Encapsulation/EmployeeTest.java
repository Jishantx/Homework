package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpname("Rashna Zafar");
		employee.setEmpage(39);
		employee.setEmpsex('F');
		employee.setIsempcitizen(false);
		
		System.out.println("Employee Name: " + employee.getEmpname() + "\nEmployee Age: " + employee.getEmpage() + "\nEmployee Sex: "
				+ employee.getEmpsex() + "\nIs US Citizen? : " + employee.isIsempcitizen());
	}
}
