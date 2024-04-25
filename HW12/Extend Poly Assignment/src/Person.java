/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/10/2019
 */

abstract public class Person {
	
	private int age;
	protected Name name;
	
//constructor	
public Person (Name name, int age) {	
	setName(name);
	setAge(age);
}

//AGE GETTERS AND SETTERS
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
//NAME GETTERS AND SETTERS
public Name getName() {
	return name;
}

public void setName(Name name) {
	this.name = name;
	
}

public String toString() {
	String result;
	
	result= "Hello, my name is "+ name+ ". I am "+ age+ " years old. ";
	return result;
}
	
	
	
	

}
