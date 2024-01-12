package hw09Encapsulation;

public class Employee {
	
	private String empname;
	private int empage;
	private char empsex;
	private boolean isempcitizen;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public char getEmpsex() {
		return empsex;
	}
	public void setEmpsex(char empsex) {
		this.empsex = empsex;
	}
	public boolean isIsempcitizen() {
		return isempcitizen;
	}
	public void setIsempcitizen(boolean isempcitizen) {
		this.isempcitizen = isempcitizen;
	}
	
}
