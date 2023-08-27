package animal_abstract;


public class Duck extends Animal{

	public Duck(boolean isMammal, boolean isCarvorous) {
		super(isMammal, isCarvorous);
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "quack";
	}
	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "A duck says '" + getGreeting() + "', is " + (isCarvorous() ? "": "not")  + " carnivorous, and is " + (isMammal() ? "" : " not") + " a mammal.";

	}
}
