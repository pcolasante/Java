/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/3/2019
 */

abstract public class Athlete extends Person {

	private String team, position;

	// constructor
	public Athlete(Name name, int age, String team, String position) {
		super(name, age);
		setTeam(team);
		setPosition(position);
	}

// TEAM GETTERS AND SETTERS
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

// POSITION GETTERS AND SETTERS
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		String result;
		result = super.toString() + "I am part of the " + team + " team. My current position is as " + position + ".";
		return result;
	}

	abstract public void doThis();
}
