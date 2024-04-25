/* Author: Paulina Flores
 * Date: 11/12/19
 * Purpose: Pick a theme. Make your own classes. Create an Abstract Class with Abstract methods, a class that uses the methods, and a test class.
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
		System.out.println("Hello, my name is " + name);
	}
	
	public void makeNoise () { // abstract method for noise
		System.out.println("Meow.");
	}
	
	public void location () { // abstract method for location
		System.out.println("I am wherever I want to be.");
	}	
}
