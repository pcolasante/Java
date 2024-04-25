/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/3/2019
 */

public class Name {

	private String firstName;
	private String middleName;
	private String lastName;

	public Name(String first, String middle, String last) { // Constructor method including the middle name.
		setFirstName(first);
		setMiddleName(middle);
		setLastName(last);
	}

	public Name(String first, String last) { // Constructor method that excludes the middle name.
		setFirstName(first);
		setLastName(last);
	}

	// FIRST NAME GETTER AND SETTER.
	public String getFirstName() { // getter
		return firstName;

	}

	public void setFirstName(String first) { // setter
		char[] nameOne = first.toCharArray();

		if (Character.isUpperCase(nameOne[0]) == false) {
			nameOne[0] -= 32;
		}

		for (int i = 1; i < nameOne.length; i++) {
			if (Character.isUpperCase(nameOne[i]) == true) {
				nameOne[i] += 32;
			}
		}

		String temp = new String(nameOne);
		this.firstName = temp;
	}

	// MIDDLE NAME GETTER AND SETTER

	public String getMiddleName() { // getter
		return middleName;

	}

	public void setMiddleName(String middle) { // setter
		char[] nameTwo = middle.toCharArray();

		if (Character.isUpperCase(nameTwo[0]) == false) {
			nameTwo[0] -= 32;
		}

		for (int i = 1; i < nameTwo.length; i++) {
			if (Character.isUpperCase(nameTwo[i]) == true) {
				nameTwo[i] += 32;
			}
		}

		String temp = new String(nameTwo);
		this.middleName = temp;
	}

	// LAST NAME GETTER AND SETTER.

	public String getLastName() { // getter
		return lastName;

	}

	public void setLastName(String last) { // setter
		char[] nameThree = last.toCharArray();

		if (Character.isUpperCase(nameThree[0]) == false) {
			nameThree[0] -= 32;
		}

		for (int i = 1; i < nameThree.length; i++) {
			if (Character.isUpperCase(nameThree[i]) == true) {
				nameThree[i] += 32;
			}
		}

		String temp = new String(nameThree);
		this.lastName = temp;
	}

	public String toString() {
		String result;
		result = firstName + " " + middleName + " " + lastName;
		return result;
	}

}
