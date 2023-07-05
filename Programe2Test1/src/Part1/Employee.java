package Part1;

abstract class Employee {
	protected int id; //Represents the employee's ID number.
	protected String name; // Represents the employee's name.
	
	// default constructor
	public Employee() {
		id = 10;
		name = "Lisi";
	}
	
	// parameter constructor
	public Employee(int id,	String name) {
		this.id = id;
		this.name = name;
	}
	
	// copy constructor
	public Employee(Employee e) {
		this.id = e.id;
		this.name = e.name;
	}
	
	//initial calculate method
	public abstract double calculateSalary();
	
	
	
	
	public static void main(String[] args) {
		
		//Create a `Faculty` object with an ID, name, and a monthly salary of $5000. 
		Faculty faculty = new Faculty(10000, "Alex", 5000);
		
		//Calculate and display the annual salary of the faculty member.
		System.out.println(faculty.name + "'s annual salary is " + faculty.calculateSalary());
		
		//Create a `Staff` object with an ID, name, an hourly rate of $15, and 160 hours worked. 
		Staff staff = new Staff(10001, "Friday", 15, 160);
		
		//Calculate and display the monthly salary of the staff member.
		System.out.println(staff.name + "'s monthly salary is " + staff.calculateSalary());
	}
}
