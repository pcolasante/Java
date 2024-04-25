/* Author: Paulina Flores
 * Date: 11/12/19
 * Purpose: Pick a theme. Make your own classes. Create an Abstract Class with Abstract methods, a class that uses the methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */

public class Wolf extends Animal { // designs the subclass of parent class Animal

	private String name; // variable for names
	private String species; // variable for species name
	
	public Wolf(int weight, double height, String name, String species) {
		super(weight, height); // to call the parent class
		setName(name);
		setSpecies(species);
	}
// species
	public String getSpecies() { // GETTER SPECIES
		return species;
	}

	public void setSpecies(String species) { // SETTER SPECIES
		this.species = species;
	}

	public String getName() { // GETTER NAME
		return name;
	}

	public void setName(String name) { // SETTER NAME
		this.name = name;
	}
	
public String toString() {
	String result;
	result = "Wolf ---> My name is: " + name + ". " + super.toString() + " My wolf species name is: " + species + ".";
	return result;
	
}
// abstract methods

public void hello () { // abstract method for hello
	System.out.println("Hey, my name is " + name + ". We like to eat large animals, like deer, elk, and moose.");
}

public void makeNoise () { // abstract method for noise
	System.out.println("Growl.");
}

public void location () { // abstract method for location
	System.out.println("We live in the wilderness, mostly in the North.");
}
}
