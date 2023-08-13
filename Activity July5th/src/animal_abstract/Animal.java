package animal_abstract;

//create an abstract class to define subclass
public abstract class Animal {
	protected boolean isMammal;
	protected boolean isCarivorous;
	
	public Animal(boolean isMammal, boolean isCarvorous) {
		this.isMammal = isMammal;
		this.isCarivorous = isCarvorous;
	}
	
	//getters
	public boolean isMammal() {
		return this.isMammal;
	}
	public boolean isCarvorous() {
		return this.isCarivorous;
	};
	
	//abstract method
	public abstract String getGreeting();
	public abstract String describe();
}
