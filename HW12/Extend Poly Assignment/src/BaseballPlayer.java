/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/10/2019
 */

public class BaseballPlayer extends Athlete {
	
	private String battingPosition;
	
public BaseballPlayer (Name name, int age, String team, String position, String battingPosition ) {
	super(name, age, team, position);
	setBattingPosition(battingPosition);
	
}
// BATTING POSITION GETTERS AND SETTERS
public String getBattingPosition() {
	return battingPosition;
}

public void setBattingPosition(String battingPosition) {
	if(battingPosition == "Left Handed" || battingPosition == "Right Handed" || battingPosition == "Both Hands") {
		this.battingPosition = battingPosition;
	}else{
		System.out.println("Invalid input for " + name +"'s batting position.");
	}
}

//Overridden methods person and athlete
public String toString() {
	String result;
	result= super.toString()+" I am a baseball player. My batting position is "+ battingPosition + ".";
	return result;
}

public boolean equals(Object obj) {
	
	boolean result = true;
	
	if(this.getBattingPosition() == ((BaseballPlayer)obj).getBattingPosition()){
		result = true;
	}else {
		result = false;
	}
	
	return result;
}

//abstract method doThis
@Override
public void doThis() {
	System.out.println(name +" ---> I hit something.");
	
}
//interface
@Override
public void quickFact() {
	System.out.println(name +" ---> Did you know? Baseballs were originally made from the foreskins of horses.");
	
}

}
