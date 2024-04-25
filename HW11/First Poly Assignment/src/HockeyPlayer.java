/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/3/2019
 */

public class HockeyPlayer extends Athlete {

	private String stickBrand;

	public HockeyPlayer(Name name, int age, String team, String position, String stickBrand) {
		super(name, age, team, position);
		setStickBrand(stickBrand);

	}

// GET STICK BRAND GETTERS AND SETTERS
	public String getStickBrand() {
		return stickBrand;
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	// Overridden methods person and athlete
	public String toString() {
		String result;
		result = super.toString() + "I am a hockey player. My stick brand is " + stickBrand + ".";
		return result;
	}

	// equals method
	public boolean equals(Object obj) {

		boolean result = true;

		if (this.getStickBrand() == ((HockeyPlayer) obj).getStickBrand()) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

//abstract methods
	@Override
	public void doThis() {
		System.out.println("I sit in a penalty box.");

	}

}
