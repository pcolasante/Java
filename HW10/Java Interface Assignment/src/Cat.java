/* Author: Paulina Flores
 * Date: 11/19/19
 * Purpose: Pick a theme. Make your own classes. Make your own interfaces. Create 3 interfaces with Abstract methods, a class that uses the interfaces and methods, and a test class.
 * Getters, setters, constructors, and methods.
 * Create a reasonable test case.
 */
public class Cat extends Animal { // designs the subclass of parent class Animal
	
	private String name; // variable for names
	private int lives; // variable for lives.
	
	public Cat (int weight, double height, String name, int lives) {
		super(weight, height);
		setName(name);
		setLives(lives);
		
	}
//Name
	public String getName() { // GETTER NAME
		return name;
	}

	public void setName(String name) { // SETTER NAME
		this.name = name;
	}
//Lives
	public int getLives() { // GETTER NAME
		return lives;
	}

	public void setLives(int lives) { // SETTER NAME
		
		lives = 9 - lives;
		
		this.lives = lives;
	}

	public String toString() {
		String result;
		result = "Cat ---> My name is: " + name + ". " +  super.toString() + " And I have " + lives + " life(lives) left.";
		return result;
		
}
	//ABSTRACT METHODS
	public void hello () { // abstract method for hello
		System.out.println("Cat --> Hello, my name is " + name);
	}
	
	public void makeNoise () { // abstract method for noise
		System.out.println("Cat --> Meow.");
	}
	
	public void location () { // abstract method for location
		System.out.println("Cat --> I am wherever I want to be.");
	}	
	
	//INTERFACES

public void averageLifeSpan() {
	
	System.out.println("Cats --> They have an average life span of 2 to 16 years in the wild.");
}

public void periodGestation() {
	System.out.println("Cats --> The gestation period for cats is fifty-eight to sixty-seven days.");
}
}
