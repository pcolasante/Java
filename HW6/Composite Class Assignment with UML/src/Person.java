
public class Person {
	Name name;
	private char gender;
	private int age;
	private int salary;

	public Person(Name name, char gender, int age, int salary) {
		setName(name);
		setGender(gender);
		setAge(age);
		setSalary(salary);
	}

// NAME GETTER AND SETTER
	public Name getName() { // getter
		return name;
	}

	public void setName(Name name) { // setter

		this.name = name;
	}

// GENDER GETTER AND SETTER

	public char getGender() { // getter
		return gender;
	}

	public void setGender(char gender) { // setter

		if (gender == 'F' || gender == 'M' || gender == 'O') { // F = female, M = male, O = other
			this.gender = gender;
		} else {
			System.out.println("Invalid gender for: " + this.name);
		}
	}

// AGE GETTER AND SETTER 

	public int getAge() { // getter
		return age;
	}

	public void setAge(int age) { // setter

		if (age >= 1 && this.age <= 120) { // age between 1 and 120.
			this.age = age;
		} else {
			System.out.println("Invalid Age for: " + this.name);
		}
	}
// SALARY GETTER AND SETTER

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {

		if (this.salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid Salary for: " + this.name);
		}
	}

	public String toString() {
		String results;

		String space = new String(", ");
		results = name + space + gender + space + age + space + salary;
		return results;

	}

}
