package Part1;

public class Faculty extends Employee{
	private  double monthlySalary; // Represents the monthly salary of the faculty member.
	
	//parameter constructor
	public Faculty(int id, String name, double monthlySalary) {
		super(id, name);
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return  monthlySalary * 12;
	}

}
