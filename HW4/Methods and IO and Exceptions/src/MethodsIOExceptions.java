/* Author: Paulina Flores
 * Date: 10/3/19
 * Purpose: To make a menu driven program that will use a switch statement.
 * 
 * The options are: 
 * 1.  Read the user’s first name and echo it back out 20 times.
 * 2.  Read the user’s age and double it and display the age and the doubled age.
 * 3.  Read the user's age and output one of the following statements:
 * 			Since you are xx years old, you are a teenager
 * 			Since you are xx years old, you are NOT a teenager   (***of course xx displays the user's age)
 * 4.  Read a single integer between 3 and 50 from the user. 
 * 		Create a triangle of X’s with the as many rows as the value of the user's input.  
 * 		The triangle needs to be displayed on the screen and in a text document named triangle.txt.
 */

import java.util.*;
import java.io.*;

public class MethodsIOExceptions {

	public static void main(String[] args) {
		//setting variables
		char choice;
		int numberAge, numberTeenager, numberTriangle;
		int ageDouble, teenagerAge, triangle;
		String repeat;
		String first_name;

		Scanner main = new Scanner(System.in); // input from user
		do {
			choice = getChoice(); // variable from the menu.
			switch (choice) {
			case '1': // repeat a name
				System.out.println("What's your name?");
				first_name = main.next();

				repeat = repeatName(first_name);

				break;
			case '2': // double a number
				System.out.println("How old are you?");
				numberAge = main.nextInt();

				ageDouble = doublingAge(numberAge);

				break;
			case '3': // if - else (Are they a teenager?)
				System.out.println("What's your age?");

				numberTeenager = main.nextInt();

				teenagerAge = teenagerOrNot(numberTeenager);

				break;
			case '4': // creating triangles.
				System.out.println("Tell me a number:");

				numberTriangle = main.nextInt();

				triangle = makeTriangle(numberTriangle);

				break;
			case '5': // quit
				System.out.println("Thank you for using my program.  Have a nice day.");
				break;
				
			default: // quit
				System.out.println("Invalid Selection...try again.");
				break;
			} // end switch
		} while (choice != '5');

	}

	public static char getChoice(){ //menu design
		char result;
		Scanner input = new Scanner(System.in);

		System.out.println("1. Tell me your name, and I'll repeat it 20 times.");
		System.out.println("2. What's your age, doubled?");
		System.out.println("3. Are you a teenager?");
		System.out.println("4. Give me a number, I'll show you a triangle.");
		System.out.println("5. Good bye.");
		System.out.print("Enter selection: ");

		result = input.nextLine().toUpperCase().charAt(0); // converts the character entered into a capital letter.
		return result;

	}
// Repeat name method.
	public static String repeatName(String first_name) {
		int i;
		String result = null;

		for (i = 0; i < 20; i++)

			System.out.println(first_name);
		return result;
	}
// Doubling the age method.
	public static int doublingAge(int numberAge) {
		int result = 0;
		result = numberAge + numberAge;
		System.out.println("Your age is: " + numberAge);
		System.out.println("Your age doubled is: " + result);
		return result;

	}
// Teenager classification method.
	public static int teenagerOrNot(int numberTeenager) {
		int result = 0;
		if (13 <= numberTeenager && numberTeenager <= 19) {
			System.out.println("A teenager is someone between 13 and 19 years old.");
			System.out.println("Since you are " + numberTeenager + " year(s) old, you are a teenager.");
		} else {
			System.out.println("A teenager is someone between 13 and 19 years old.");
			System.out.println("Since you are " + numberTeenager + " year(s) you are NOT a teenager.");

		}
		return result;
	}
// Making triangles method.
	public static int makeTriangle(int nameTriangle) {
		PrintWriter writer;
		// try and catch
		try {
			writer = new PrintWriter("path\\triangle.txt");
		} catch (IOException e) {
			System.out.println("File output failed. Try again.");
		
		}
		int result = 0;

		if (nameTriangle >= 3 && nameTriangle <= 50) {
			for (int r = 1; r <= nameTriangle; r++) {
				for (int sp = (nameTriangle - r); sp >= 1; sp--) {
					System.out.print(" ");
				}
				for (int c = 1; c <= (r * 2) - 1; c++) {
					System.out.print("X");
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid input. Try a number between 3 and 50.");
		}
		return result;
	}
}
