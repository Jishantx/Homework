package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal () ;
		animal.animalInfo();
		System.out.println("\n----------------------------------------------------\n");
	
		
		Birds birds = new Birds ();
		birds.birdsInfo(); 
		birds.animalInfo();
		System.out.println("\n----------------------------------------------------\n");
		
		BullDog bullDog = new BullDog ();
		bullDog.bullDogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		//Multi-Level Inheritance: BullDog is created from Mammal Class which is created from Animal class.
		System.out.println("\n----------------------------------------------------\n");
		
		
		Cobra cobra = new Cobra ();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n----------------------------------------------------\n");
		
		Dog dog = new Dog ();
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();
		System.out.println("\n----------------------------------------------------\n");
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo ();
		mammal.animalInfo();
		//Single Inheritance: Mammal class Inherits from Animal class only
		System.out.println("\n----------------------------------------------------\n");
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n----------------------------------------------------\n");
		
		Robin robin = new Robin ();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n----------------------------------------------------\n");
		
		Snake snake = new Snake ();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
	// Hierarchical Inheritance: Mammal Class extends to Animal Class, Reptile Class extends to Animal Class, Birds class extends to animal class.
	
	
	}
	
	
}
