/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/3/2019
 */

public class SoccerPlayer extends Athlete {

	private String fieldPosition;

	public SoccerPlayer(Name name, int age, String team, String position, String fieldPosition) {
		super(name, age, team, position);
		setFieldPosition(fieldPosition);
	}

// FIELD POSITION GETTERS AND SETTERS
	public String getFieldPosition() {
		return fieldPosition;
	}

	public void setFieldPosition(String fieldPosition) {
		this.fieldPosition = fieldPosition;
	}

	// Overridden methods person and athlete
	public String toString() {
		String result;
		result = super.toString() + "I am a soccer player. My field position is " + fieldPosition + ".";
		return result;
	}

	public boolean equals(Object obj) {

		boolean result = true;

		if (this.getFieldPosition() == ((SoccerPlayer) obj).getFieldPosition()) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	// abstract methods
	@Override
	public void doThis() {
		System.out.println("I kick the ball.");

	}

}
