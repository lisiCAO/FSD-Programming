package Part1;

public class Cow extends Animal {
	public Cow(boolean isMammal, boolean isCarnivorous) {
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
		s = "A cow says 'moo'";
		return s + m + n;
	}

	@Override
	protected boolean isMammal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected boolean isCarnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

}
