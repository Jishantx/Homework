package hw18JavaSwitch;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;


public class LevelOfJava {
	public static void main(String[] args) {
		System.out.println("<-- Please Write about your Java level -->");
		
		Scanner scanner = new Scanner(System.in);
		String myLevel = scanner.toString();
		
		switch (myLevel) {
		case "beginner":
			System.out.println("I am at he beginning level");
			break;
		case "Intermediate":
			System.out.println("I am at the intermediate level");
			break;
			
		case "Expert":
			System.out.println("I have a Java Certification from Oracle");
			break;
		default :
			System.out.println("I am a drop out");
			break;
			
		}
		scanner.close();
		
		
		
		
		
		
		
	}
	

}
