package Part1;

public class Duck extends Animal{

	public Duck(boolean isMammal, boolean isCarvorous) {
		super(isMammal, isCarvorous);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "quack";
	}
	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "A duck says '" + getGreeting() + "', is " + (getIsCarvorous() ? "": "not")  + " carnivorous, and is " + (getIsMammal() ? "" : " not") + " a mammal.";
	}

}
