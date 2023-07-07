package Part1;

public abstract class Animal {
	protected boolean isMammal;
	protected boolean isCarivorous;
	
	public Animal(boolean isMammal, boolean isCarvorous) {
		this.isMammal = isMammal;
		this.isCarivorous = isCarvorous;
	}
	
	public boolean getIsMammal() {
		return this.isMammal;
	}
	public boolean getIsCarvorous() {
		return this.isCarivorous;
	};
	
	public abstract String getGreeting();
	public abstract String describe();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog(true, true);
		Cow cow = new Cow(true,false);
		Duck duck = new Duck(false, false);
		
		
		System.out.println(dog.describe());
		System.out.println(cow.describe());
		System.out.println(duck.describe());
		
		

	}

}
