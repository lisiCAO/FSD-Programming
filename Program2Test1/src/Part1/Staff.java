package Part1;

public class Staff extends Employee{
	private  double hourlyRate; // Represents the hourly rate of the staff member.
	private  int hoursWorked; // Represents the number of hours worked by the staff member.
	
	
	//parameter constructor
	public Staff(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}

}
