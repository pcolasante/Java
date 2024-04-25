/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/10/2019
 */

public class HockeyPlayer extends Athlete {
	
	private String role;

	public HockeyPlayer(Name name, int age, String team, String position, String role) {
		super(name, age, team, position);
		setRole(role);
		
	}
// GET STICK BRAND GETTERS AND SETTERS
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		if(role == "Skater" ^ role == "Goalie") {
			this.role = role;
		}else {
			System.out.println("Invalid input for " + name +"'s role.");
		}
		

	}
	
	//Overridden methods person and athlete
	public String toString() {
		String result;
		result= super.toString()+" I am a hockey player. My role is "+ role + ".";
		return result;
	}
	
	//equals method
public boolean equals(Object obj) {
		
		boolean result = true;
		
		if(this.getRole() == ((HockeyPlayer)obj).getRole()){
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
//abstract methods
	@Override
	public void doThis() {
		System.out.println(name +" ---> I sit in a penalty box.");
		
	}
// interface
	public void quickFact() {
		System.out.println(name +" ---> Did you know? Hockey legend Gordie Howe suffers from cryophobia, the extreme fear of cold and ice.");
		
	}

	

}
