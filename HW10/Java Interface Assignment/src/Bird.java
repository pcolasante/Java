/* Author: Paulina Flores
 * Date: 11/19/19
 * Purpose: Pick a theme. Make your own classes. Make your own interfaces. Create 3 interfaces with Abstract methods, a class that uses the interfaces and methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */

public class Bird extends Animal implements LifeSpan, GestationPeriod { // designs the subclass of parent class Animal

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
	// abstract methods
	public void hello () { // abstract method for hello
		System.out.println("Bird --> Hi! Did you know there are over 9,500 bird species in the world? It's awesome!");
	}
	
	public void makeNoise () { // abstract method for noise
		System.out.println("Bird --> Chirp, chirp!");
	}
	
	public void location () { // abstract method for location
		System.out.println("Bird --> You can find me anywhere, in the sky, on the beach, even in the South Pole! We are everywhere.");
	}
	
	// interfaces
	

public void averageLifeSpan() {
	
	System.out.println("Birds --> The average life span of a bird also varies, but most are able to live for 20 years or more. Some exceptions apply on smaller birds.");
}
public void periodGestation() {
	System.out.println("Birds --> The gestation period varies for birds, though larger birds have a much longer gestation period than smaller birds.");

	
}
}