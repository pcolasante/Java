/* Student will demonstrate the ability to apply polymorphism in a Java program. 
 * Author: Paulina Flores
 * Date: 12/10/2019
 */
import java.util.Scanner;
public class Polymorphism {

	public static void main(String[] args) {
		
		Person[] arr;
		arr = new Person[100]; //array

			//Hank
			Name hankName = new Name("Hank", "H.", "Aaron"); 
			arr[0] = new BaseballPlayer(hankName, 32, "Magallanes", "Second Baseman", "Both Hands");
			
			
			//Terry
			Name terryName = new Name("Terry","F.", "Bradshaw");
			arr[1] = new FootballPlayer(terryName, 22, "Florida Gators", "Fullback", "Offense");
			
			
			//Mario
			Name marioName = new Name("Mario", "Lemieux");
			arr[2] = new HockeyPlayer(marioName, 23, "Florida Panthers", "Goaltender", "Goalie");
						
			//Paula
			Name paulaName = new Name("Paula","X.", "Creamer");
			arr[3] = new Golfer(paulaName, 27, "Red", "P1", "BMW");
			
			
			//Brian
			Name brianName = new Name("Brian","T.", "Rowe");
			arr[4] = new SoccerPlayer(brianName, 28, "A.C. Milan",
					"8 (Central/Box-to-Box Midfielder)", "Mid Fielder");
			
			
			//Barry
			Name barryName = new Name ("Barry", "B.", "Bonds");
			arr[5] = new BaseballPlayer(barryName, 28, "A.C. Milan",
					"8 (Central/Box-to-Box Midfielder)", "Left Handed");
			
			//Payton
			Name paytonName = new Name("Payton", "A.", "Manning");
			arr[6] = new FootballPlayer(paytonName, 28, "UCF Knights", "Fullback", "Defense");
			
			
			//Phil
			Name philName = new Name("Phil", "A.", "Mickleson");
			arr[7] = new Golfer(philName, 51, "Grey", "P8","Walmart");
			
			//Wayne
			Name wayneName = new Name("Wayne", "Gretzky");
			arr[8] = new HockeyPlayer(wayneName, 24, "New Jersey Devils", "Goaltender", "Goalie");
			
			
			//Dom
			Name domName = new Name ("Dom", "A.", "Dwyer");
			arr[9] = new SoccerPlayer(domName, 25, "A.C. Milan",
					"5 Center Back (or Sweeper)", "Defender");
		
			
			//Kate
			Name kateName = new Name ("Kate", "E.", "Kane");
			arr[10] = new SoccerPlayer(kateName, 21, "Team U.S.A.",
					"5 Center Back (or Sweeper)", "Defender");
			
			
			//Maria
			Name mariaName = new Name("Maria", "Lovelace");
			arr[11] = new Golfer(mariaName, 26, "Yello", "P4","Under Armour");
			
			
			
			//Axel
			Name axelName = new Name("Axel", "Grayson");
			arr[12] = new HockeyPlayer(axelName, 23, "Toronto Maple Leafs", "Forwards", "Skater");
			
			
			//Jake
			Name jakeName = new Name("Jake", "S.", "Peters");
			arr[13] = new FootballPlayer(jakeName, 28, "UCF Knights", "Fullback", "Defense");
			
			
			//Roy
			Name royName = new Name("Roy", "H.", "Mason"); 
			arr[14] = new BaseballPlayer(royName, 32, "New York Yankees", "Second Baseman", "Both Hands");

			
			//Lillian
			Name lillianName = new Name("Lillian", "Zachariah");
			arr[15] = new Golfer(lillianName, 26, "Blue", "P3","Bridgestone");

			
			//Paulina
			Name paulinaName = new Name ("Paulina", "E.", "Colasante");
			arr[16] = new SoccerPlayer(paulinaName, 21, "Team Italy",
					"5 Center Back (or Sweeper)", "Defender");

			
			//Gabriele
			Name gabrieleName = new Name ("Gabriele", "E.", "Colasante");
			arr[17] = new BaseballPlayer(gabrieleName, 28, "Magallanes",
					"8 (Central/Box-to-Box Midfielder)", "Left Handed");

			
			//William
			Name williamName = new Name("William", "Boada");
			arr[18] = new HockeyPlayer(williamName, 23, "Boston Bruins", "Centerman", "Skater");

			
			
			int choice ;
			Scanner input = new Scanner (System.in);
			
			
			do {
				System.out.println(" ");
				System.out.println("--------------------");
				System.out.println("Menu");
				System.out.println("--------------------");
				System.out.println("1.) Call Activity of each Person"); // abstract method doThis
				System.out.println("2.) Call Quick Fact of each Person"); // abstract method from interface (quickFact)
				System.out.println("3.) Call Biography of each Person"); // toString
				System.out.println("4.) Cancel");
				System.out.println("Enter Your Choice:");
				choice = input.nextInt();
			
			}while (choice > 5);
			
			
			switch(choice) {
			
			case 1:
				
				for(int i = 0; i < 16;i++ ) {
					callThisMethods((Athlete) arr[i]); //doThis
				}
				
			
				break;
			
			case 2:
			
				for(int i = 0; i < 16;i++ ) {
					callQuickFact((Athlete) arr[i]); //quickFact
				}
				
				break;
				
			case 3:
				
				for(int i = 0; i < 16;i++ ) {
					printOutString((Athlete) arr[i]); //toString
				}
				
				break;
				
			case 4:
				System.out.println("Exiting Program...");
		        System.exit(0);
		        
		        break;
				
			default :
	            System.out.println("This is not a valid Menu option! Please Select Another");
	            
	            break;    
			}
			

		}

		public static void printOutString(Athlete obj) {
			System.out.println(obj);
		}
		
		
		public static void callThisMethods(Athlete arr) {
			arr.doThis();
		}
		
		public static void callQuickFact(Athlete obj) {
			obj.quickFact();
		}
	}