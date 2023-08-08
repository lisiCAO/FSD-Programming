package Part1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog(true, true);
		Cow cow = new Cow(true,false);
		Duck duck = new Duck(false, false);
		
		
		System.out.println(dog.describe());
		System.out.println(cow.describe());
		System.out.println(duck.describe());
		System.exit(0);
	}

}
