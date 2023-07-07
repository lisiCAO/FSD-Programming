package Part1;

public class Cow extends Animal{

	public Cow(boolean isMammal, boolean isCarvorous) {
		super(isMammal, isCarvorous);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "moo";
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "A cow says '" + getGreeting() + "', is " + (getIsCarvorous() ? "": "not")  + " carnivorous, and is " + (getIsMammal() ? "" : " not") + " a mammal.";
	}
	
	

}
