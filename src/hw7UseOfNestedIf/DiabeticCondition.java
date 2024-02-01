package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");
		
		Scanner scanner = new Scanner(System.in);
		double hbA1C = scanner.nextDouble();
		
		if (hbA1C > 6.4 ) {
			System.out.println("I am a diabetic patient");
		}
		else if (hbA1C <=6.4) {
			System.out.println("Congratulation! you are not diabetic");
		}
		else {
			if (hbA1C >= 5.7) {
				System.out.println("I am a pre-diabetic patient");
			}
			else if (hbA1C < 5.7) {
				System.out.println("I am a healthy person");
			}
			scanner.close();
		}
		
		
		
	}

}
