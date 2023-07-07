package Part1;

abstract class Animal {

	public abstract boolean getIsMammal();

	public abstract boolean getIsCarnivorous();

	protected abstract boolean isMammal();

	protected abstract boolean isCarnivorous();

	public Animal(boolean isMammal, boolean isCarnivorous) {
		isMammal = true;
		isCarnivorous = true;
	}

	public abstract String getGreeting();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog(false, false);
		Duck duck = new Duck(false, false);
		Cow cow = new Cow(false, false);

		System.out.println(dog.getGreeting());

		System.out.println(duck.getGreeting());

		System.out.println(cow.getGreeting());

	}

}
