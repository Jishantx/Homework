package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {
		// Default Constructor is declared

		System.out.println("This is from the default Constructor and Computer class");

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		// Parameterized Constructor is declared
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating System: " + operatingSystem
				+ ", Price: " + "$" + price + ", Grade: " + grade + ", Made in the USA? :" + madeInUsa);

	}

}
