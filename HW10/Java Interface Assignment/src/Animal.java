/* Author: Paulina Flores
 * Date: 11/19/19
 * Purpose: Pick a theme. Make your own classes. Make your own interfaces. Create 3 interfaces with Abstract methods, a class that uses the interfaces and methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */
abstract public class Animal extends Object implements LifeSpan, GestationPeriod, Noisy {

	private int weight; // weight variable
	private double height; // height variable

	public Animal(int weight, double height) { // constructor method
		super();
		setWeight(weight);
		setHeight(height);

	}

	//ABSTRACT METHODS
	abstract public void makeNoise(); // to make noise
	abstract public void location(); // location of animal
	abstract public void hello(); // introduction of animal
	//INTERFACES
	public void beLoud() {
		System.out.println("I don't make any noise");
	}
	
// height
	public double getHeight() { // GETTER HEIGHT
		return height;
	}

	public void setHeight(double height) { // SETTER HEIGHT
		this.height = height;
	}

// weight
	public int getWeight() { // GETTER WEIGHT
		return weight;
	}

	public void setWeight(int weight) { // SETTER WEIGHT
		this.weight = weight;
	}

//String toString	
	public String toString() {
		String result;
		result = "I'm an animal weighting " + weight + " lbs, with a height of " + height + "ft.";
		return result;
	}
}
