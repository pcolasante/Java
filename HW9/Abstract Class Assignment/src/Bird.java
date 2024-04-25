/* Author: Paulina Flores
 * Date: 11/12/19
 * Purpose: Pick a theme. Make your own classes. Create an Abstract Class with Abstract methods, a class that uses the methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */

public class Bird extends Animal { // designs the subclass of parent class Animal

	private int wingSpan; // variable for the distance on wing span
	private boolean canFly; // variable for T/F on whether a bird can fly

	public Bird (int weight, double height, int wingSpan, boolean canFly) {
	super(weight, height);
	setWingSpan(wingSpan);
	setCanFly(canFly);
	
}
// Wing Span
	public int getWingSpan() { // GETTER WING SPAN
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) { // SETTER WING SPAN
		this.wingSpan = wingSpan;
	}

// Can Fly?
	public boolean isCanFly() { // GETTER CAN FLY
		return canFly;
	}

	public void setCanFly(boolean canFly) { // SETTER CAN FLY
		this.canFly = canFly;
	}
	
	public String toString() {
		String result;
		result = "Bird ---> " + super.toString() + " I have a wing span of: " + wingSpan + ". Can I fly? It is " + canFly;
		return result;
		
}
	public void hello () { // abstract method for hello
		System.out.println("Hi! Did you know there are over 9,500 bird species in the world? It's awesome!");
	}
	
	public void makeNoise () { // abstract method for noise
		System.out.println("Chirp, chirp!");
	}
	
	public void location () { // abstract method for location
		System.out.println("You can find me anywhere, in the sky, on the beach, even in the South Pole! We are everywhere.");
	}
}