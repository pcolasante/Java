/* Name: Paulina Flores
 * Date: 09/12/2019
 * Assignment: Basic IO Program
 * Purpose: To create a short program that asks the user for three numbers. 
 * Output should be the sum and average of the three numbers. 
 * 
 */
import java.util.Scanner; //This allows the program to receive input from the user.
public class BasicIOProgram {

	public static void main  (String args[]) {
	
		// collecting the values
		System.out.println("The three numbers are: ");
		Scanner in = new Scanner(System.in); // caused a problem: a resource leak.
		double number1 = in.nextDouble(), number2 = in.nextDouble(), number3 = in.nextDouble();
		
		//calculating the sum
		int sumResult = (int) number1 + (int) number2 + (int) number3; // (int) down-casting in order to show sumResult as a number without decimals.
		System.out.println("The sum of the numbers is: "+sumResult);
		
		//calculating the average
		double averageResult = sumResult / 3;
		System.out.println("The average of the numbers is: "+ averageResult);
		
		in.close();//solved problem of "resource leak"
	}
}

