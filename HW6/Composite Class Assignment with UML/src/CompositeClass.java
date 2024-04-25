public class CompositeClass {

	public static void main(String[] args) {
		
		Name creatureOne = new Name("PAULINA", "ELENA", "FLORES");
		Name creatureTwo = new Name("MASHA", "ZASCHAKOVI");
		Name creatureThree = new Name("GABRIELE", "ELIAS", "FLORES");
		
		Person humanOne = new Person(creatureOne, 'F', 20, 4250);
		Person humanTwo = new Person(creatureTwo, 'O', 47, 56000);
		Person humanThree = new Person(creatureThree, 'M', 21, 3520);
		
		System.out.println(humanOne.toString());
		System.out.println(humanTwo.toString());
		System.out.println(humanThree.toString());
		
		

	}

}
