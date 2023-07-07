package Part1;

public class Duck extends Animal {
	public Duck(boolean isMammal, boolean isCarnivorous) {
		super(isMammal, isCarnivorous);
	}

	@Override
	public boolean getIsMammal() {
		// TODO Auto-generated method stub
		return isMammal();
	}

	@Override
	public boolean getIsCarnivorous() {
		// TODO Auto-generated method stub
		return isCarnivorous();
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		String m, n, s;
		if (getIsMammal()) {
			n = ",and is a mammal.";
		} else {
			n = ",and is not a mammal.";
		}
		if (getIsCarnivorous()) {
			m = ",is carnivorous";
		} else {
			m = ",is not carnivorous";
		}
		s = "A duck says 'quack'";
		return s + m + n;
	}

	@Override
	protected boolean isMammal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isCarnivorous() {
		// TODO Auto-generated method stub
		return false;
	}
}
