/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/10/2019
 */

public class FootballPlayer extends Athlete {
	
	private String specialty;

	public FootballPlayer(Name name, int age, String team, String position, String specialty) {
		super(name, age, team, position);
		setSpecialty(specialty);
	}
// SPECIALTY GETTERS AND SETTERS
	public String getSpecialty() {
		return specialty;
	}
	
public void setSpecialty(String specialty) {
		
		if(specialty == "Offense" || specialty == "Defense" || specialty == "Special Teams" ) {
			this.specialty = specialty;
		}else {
			System.out.println("Invalid input for " + name +"'s specialty.");
		}
		
		}

//Overridden methods person and athlete
public String toString() {
	String result;
	result= super.toString()+" I am a football player. My specialty is "+ specialty + ".";
	return result;
}

//equals method
public boolean equals(Object obj) {
	
	boolean result = true;
	
	if(this.getSpecialty() == ((FootballPlayer)obj).getSpecialty()){
		result = true;
	}else {
		result = false;
	}
	
	return result;
	}

	//Abstract method doThis
	@Override
	public void doThis() {
		System.out.println(name +" ---> I tackle something.");
		
	}
	//interface
	@Override
	public void quickFact() {
		System.out.println(name +" ---> Did you know? The NCAA required college football players to study during halftime until 1925.");
		
	}

}
