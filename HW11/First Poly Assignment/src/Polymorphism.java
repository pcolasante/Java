/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/3/2019
 */

public class Polymorphism {

	public static void main(String[] args) {

		// Hank
		Name hankName = new Name("Hank", "Ellis", "McCoy");
		BaseballPlayer hank = new BaseballPlayer(hankName, 32, "Magallanes", "Second Baseman", "Both Hands");
		System.out.println(hank);
		callThisMethods(hank);

		// Terry
		Name terryName = new Name("Terry", "Drake", "McGinnis");
		FootballPlayer terry = new FootballPlayer(terryName, 22, "Florida Gators", "Fullback", "Offense");
		System.out.println(terry);
		callThisMethods(terry);

		// Mario
		Name marioName = new Name("Mario", "Antonio", "Lovelli");
		HockeyPlayer mario = new HockeyPlayer(marioName, 23, "Florida Panthers", "Defense", "Bauer Hockey");
		System.out.println(mario);
		callThisMethods(mario);

		// Paula
		Name paulaName = new Name("Paula", "Anya", "Corazones");
		Golfer paula = new Golfer(paulaName, 27, "Team Red", "First Position", "BMW");
		System.out.println(paula);
		callThisMethods(paula);

		// Danilo
		Name daniloName = new Name("Danilo", "Estevan", "Colasante");
		SoccerPlayer danilo = new SoccerPlayer(daniloName, 28, "A.C. Milan", "8 (Central/Box-to-Box Midfielder)",
				"Mid Fielder");
		System.out.println(danilo);
		callThisMethods(danilo);

		// Barry
		Name barryName = new Name("Barry", "William", "Allen");
		BaseballPlayer barry = new BaseballPlayer(barryName, 28, "A.C. Milan", "8 (Central/Box-to-Box Midfielder)",
				"Mid Fielder");
		System.out.println(barry);
		callThisMethods(barry);

		// Peyton
		Name peytonName = new Name("Peyton", "Ellison", "Dennis");
		FootballPlayer peyton = new FootballPlayer(peytonName, 28, "UCF Knights", "Fullback", "Defense");
		System.out.println(peyton);
		callThisMethods(peyton);

		// Phil
		Name philName = new Name("Phil", "Anthony", "Coulson");
		Golfer phil = new Golfer(philName, 51, "Team Grey", "First Positon", "Walmart");
		System.out.println(phil);
		callThisMethods(phil);

		// Wayne
		Name wayneName = new Name("Wayne", "Anthony", "Kane");
		HockeyPlayer wayne = new HockeyPlayer(wayneName, 24, "New Jersey Devils", "Defense", "Sher-Wood");
		System.out.println(wayne);
		callThisMethods(wayne);

		// Carlos
		Name carlosName = new Name("Carlos", "Luca", "Colasante");
		SoccerPlayer carlos = new SoccerPlayer(carlosName, 25, "A.C. Milan", "5 Center Back (or Sweeper, if used)",
				"Defender");
		System.out.println(carlos);
		callThisMethods(carlos);

	}

	public static void callThisMethods(Athlete obj) {
		obj.doThis();
	}

}
