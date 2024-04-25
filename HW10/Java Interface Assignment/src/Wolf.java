/* Author: Paulina Flores
 * Date: 11/19/19
 * Purpose: Pick a theme. Make your own classes. Make your own interfaces. Create 3 interfaces with Abstract methods, a class that uses the interfaces and methods, and a test class.
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
	System.out.println("Wolf --> Hey, my name is " + name + ". We like to eat large animals, like deer, elk, and moose.");
}

public void makeNoise () { // abstract method for noise
	System.out.println("Wolf --> Growl.");
}

public void location () { // abstract method for location
	System.out.println("Wolf --> We live in the wilderness, mostly in the North.");
}

//interfaces

public void averageLifeSpan() {
	
	System.out.println("Wolves --> Wolves have an average life span of 10 to 18 years, but some say they only live 6 to 8 years in the wild.");
}

public void periodGestation() {
	System.out.println("Wolves --> The gestation period for wolves is fifty-nine to sixty three days.");
	
}
}
