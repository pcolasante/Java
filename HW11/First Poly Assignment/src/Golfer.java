
public class Golfer extends Athlete {

	private String mainSponsor;

	public Golfer(Name name, int age, String team, String position, String mainSponsor) {
		super(name, age, team, position);
		setMainSponsor(mainSponsor);
	}

	// MAIN SPONSOR GETTERS AND SETTERS
	public String getMainSponsor() {
		return mainSponsor;
	}

	public void setMainSponsor(String mainSponsor) {
		this.mainSponsor = mainSponsor;
	}

	// Overridden methods person and athlete
	public String toString() {
		String result;
		result = super.toString() + "I am a golfer. My main sponsor is " + mainSponsor + ".";
		return result;
	}

	// equals method
	public boolean equals(Object obj) {

		boolean result = true;

		if (this.getMainSponsor() == ((Golfer) obj).getMainSponsor()) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	// abstract methods.
	@Override
	public void doThis() {
		System.out.println("I put the ball in the hole.");

	}

}
