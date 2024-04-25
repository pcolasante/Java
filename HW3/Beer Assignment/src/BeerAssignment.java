/* 
 * Author: Paulina Flores
 * Date: 9/24/19
 * Purpose: to ask the use how many beers they expect to drink each day, on average, as well as the amount of money they spend on a single 12oz can of beer.
 * 
 * It should determine the following:
 * 1. How many beers will the user consume over the course of the year?
 * 2. Assuming a beer is 150 calories, how many calories will the user take in from beer alone over the course of the year?
 * 3. How much weight can the user expect to gain in one year based on the number of 12-ounce beers they consume every day?
 * 4. How much the user will spend on beer this year?
 * 
 */
import java.util.Scanner; // for input from user
import java.text.DecimalFormat; // to import the DecimalFormat class

public class BeerAssignment {

	public static void main(String[] args) {
		Scanner main = new Scanner(System.in); // input from user

//declaring variables
		double beersConsumed, averageCost = 0; // input
		double totalBeer, beerCalories, weightBeer, beerSpending; // processing

// how many beers are consumed daily? with non-negative real numbers.
		do {
			System.out.println("On average, how many beers (12oz) do you consume each day?");
			beersConsumed = main.nextDouble();
		}while(beersConsumed <= 0);

//how much it's spent on a single beer? must be a positive number
		do {
			System.out.println("On average, how much do you pay for a single beer (12oz)?");
			averageCost = main.nextDouble();
		}while(averageCost < 0);
		
//time to calculate!
			totalBeer = calculateTotalBeer(beersConsumed);
			beerCalories = calculateCalories(beersConsumed);
			weightBeer = calculateWeight(beersConsumed);
			beerSpending = calculateSpending(averageCost, beersConsumed);

//how to display the calculations in decimal format to two decimals
			DecimalFormat newFormat = new DecimalFormat("0.00");

// output!
			System.out.println("Approximately " + newFormat.format(totalBeer) + " cans of beers are consumed in one year.");
			System.out.println("In one year, you will consume approximately " + newFormat.format(beerCalories)
					+ " calories on beer alone.");
			System.out.println("Without diet or exercise to counter these calories, you should expect to gain "
					+ newFormat.format(weightBeer) + " pounds from drinking beer.");
			System.out.println("For the year, you will spend $" + newFormat.format(beerSpending) + " on beer alone.");
		}
	


// calculations

	public static double calculateTotalBeer(double beersConsumed) { // for the amount of beers consumed in one year.
		double result;

		result = beersConsumed * 365;

		return result;
	}

	public static double calculateCalories(double beersConsumed) { // for the amount of calories on beer alone.
		double result;

		result = (beersConsumed * 150) * 365;
		return result;

	}

	public static double calculateWeight(double beersConsumed) { // for the amount of pound on beer alone.
		double result;

		result = beersConsumed * 15;
		return result;

	}

	public static double calculateSpending(double beersConsumed, double averageCost) { // for the spending caused on beer alone.
		double result;

		result = (beersConsumed * averageCost) * 365;

		return result;

	}

}
