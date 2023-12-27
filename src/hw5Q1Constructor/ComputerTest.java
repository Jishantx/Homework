package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		// Default Constructor initialized
		Computer comp1 = new Computer();

		// Parameterized Constructor initialized
		Computer comp2 = new Computer("Apple", "MacBook Air", "MacOS Mojava", 800, 'A', false);
		Computer comp3 = new Computer("Windows", "HP Pavillion", "Windows 11 Home", 700, 'B', false);
	}

}
