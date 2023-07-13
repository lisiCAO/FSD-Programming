package Example7;

abstract class Person {
	
	public String name;
	public static final int  age = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	abstract void sayit();

}
