package animal_abstract;

public class Cow extends Animal {
	
	public Cow(boolean isMammal, boolean isCarnivorous) {
		super(isMammal, isCarnivorous);
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "moo";
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "A cow says '" + getGreeting() + "', is " + (isCarvorous() ? "": "not")  + " carnivorous, and is " + (isMammal() ? "" : " not") + " a mammal.";
	}
	}

