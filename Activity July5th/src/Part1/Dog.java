package Part1;


public class Dog extends Animal{
	public Dog(boolean isMammal, boolean isCarnivorous) {
		super(isMammal, isCarnivorous);}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "moo";
	}
	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "A dog says '" + getGreeting() + "', is " + (getIsCarvorous() ? "": "not")  + " carnivorous, and is " + (getIsMammal() ? "" : " not") + " a mammal.";
	}
	}

