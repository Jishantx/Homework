package hw5Q2Constructor;

public class StudentTest {

	public static void main(String[] args) {

		Student st01 = new Student(); // Default constructor initialized

		Student st02 = new Student("Jishan Zaman", 1234, 'F', 3.44f, true);
		Student st03 = new Student("Farruk Kabir", 1987, 'G', 4.00f, false);
		Student st04 = new Student("Maryam Kabir", 9456, 'F', 3.99f, true);

	}
}
