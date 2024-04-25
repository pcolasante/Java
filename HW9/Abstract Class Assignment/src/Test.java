import java.util.Scanner;

/* Author: Paulina Flores
 * Date: 11/12/19
 * Purpose: Pick a theme. Make your own classes. Create an Abstract Class with Abstract methods, a class that uses the methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */

public class Test {

	public static void main(String[] args) {

		// wolf class
		Wolf max = new Wolf(34, 4.5, "WILLIAM", "Grey Wolf"); // weight, height, name, species.
		max.setName("Maxwell");
		max.setWeight(56);
		System.out.println(max);

		// cat class
		Cat lily = new Cat(25, 3.4, "Lily", 4); // weight, height, name, lives
		System.out.println(lily);

		// bird class
		Bird ave = new Bird(12, 5, 13, true); // weight, height, wing span, can fly?
		System.out.println(ave);
		
		// To output the Abstract methods.

		char answer;

		Scanner main = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("Would You like to learn a few things about these animals (Y or N):");
		System.out.println(" ");

		answer = main.next().trim().charAt(0);

		if (answer == 'N') {
			System.exit(0);
		} else if (answer == 'Y') {
			learnAboutAnimal(max);
			learnAboutAnimal(lily);
			learnAboutAnimal(ave);
		} else {
			System.out.println("Invalid input");
		}

	}

	public static void learnAboutAnimal(Animal choice) {

		System.out.println(" ");
		choice.hello(); // abstract method for hello
		choice.location(); // abstract method for noise
		choice.makeNoise(); // abstract method for location

	}
}
