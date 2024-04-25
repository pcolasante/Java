
/* Author: Paulina Flores
 * Date: 10/14/19
 * Purpose of the Assignment:  to create a program that does the following:
 * 1. Create an array of 100 integers.
 * 2. Store 100 random integers (between 1 and 100) in the array.
 * 3. Print out the elements of the array.
 * 4. Sort the array in ascending order.
 * 5. Print out the sorted array.
 * 6. Prompt the user to enter a number between 1 and 100. Search the array for that number and then display  "Found" or "Not Found" message.
 * 7. Display each number from 1 to 100 and the number of times each is found in the array.
 * 8. Display the average of the numbers in the array.
 * 9. Display the highest number in the array.
 * 10.Display the lowest number in the array.
 
 USE METHODS
 */
import java.util.Arrays;
import java.util.*;

public class ArrayAssignment {

	public static void main(String[] args) {
		int[] data = new int[100]; // declares variable and allocates space for the array.

		// To store 100 random integers between 1-100 in the array.
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (100.0 * Math.random());
		}
		for (int d : data) { // this is a for each loop, it says for each d element in this array get one
			// element out and store it in the variable d.
			System.out.println("The random numbers are as follows: " + d);
		}

		// To sort the array in ascending order.
		Arrays.sort(data);

		System.out.println("The numbers in ascending order are: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		// To search the array for a number.

		int choice;
		Scanner main = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100 to find out if it's on the list: ");
		choice = main.nextInt();

		int index = Arrays.binarySearch(data, choice);
		if (index < 0) {
			System.out.println(choice + " was not found.");
		} else {
			System.out.println(choice + " was found at: ");
			System.out.println("index " + index + ".");
		}

		// Display each number from 1 to 100 and the number of times each is found in
		// the array.
		
		System.out.println("How many times are the numbers present?");
		for (int i = 1; i < data.length; i++) {
			if (data[i] != 0) {
				if (data[i] / i > 0) {
					System.out.println(i + " occurs " + (data[i] / i) + " time(s)");
				} else {
					System.out.println(i + " does not occur");
				}
			}
		}
		
		// Display the average of the numbers in the array.
		int result;
		result = findAverage(data);
		System.out.println("The average of the array is: " + result);

		// Find the highest number in the array.
		int maximum;
		maximum = maxValue(data);
		System.out.println("The maximum value in the array is: " + maximum);

		// Find the lowest number in the array.
		int minimum;
		minimum = minValue(data);
		System.out.println("The minimum value in the array is: " + minimum);
		
	}// end of the main method.

	static int findAverage(int[] data) { // method for the average of the array.
		int average = 0, sum = 0;

		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		average = sum / data.length;
		return (int) average;
	}

	public static int maxValue(int[] data) { // method for the maximum value in the array.
		int max = Arrays.stream(data).max().getAsInt();
		return max;
	}

	public static int minValue(int[] data) { // method for the maximum value in the array.
		int min = Arrays.stream(data).min().getAsInt();
		return min;
	}
}