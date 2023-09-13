package JavaEntityModeling;
import java.time.LocalDate;
import java.time.Period;
public class Employee {
	// declare variables
	private String name;
	private double salary;
	private LocalDate hireDate;

	//create constructor
	public Employee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	//import Between Method in Period class to calculate service years
	public int getYearsOfService() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	public boolean equals(Object obj) {
		//check whether these two object are the same one
		if(this == obj) {
			return true;
		}
		// if two objects are not the same one, continue check object validity and consistency in class
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		// unify Object names
		Employee employee = (Employee) obj;
		
		//compare attribute - salary, use Double.compare to check salary's equality
		if(Double.compare(employee.salary, salary) !=0){
			return false;
		}
		
		//compare attribute -name
		if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return hireDate != null ? hireDate.equals(employee.hireDate) : employee.hireDate == null;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("John Doe", 50000.0, LocalDate.of(2020, 1, 1));
        Employee employee2 = new Employee("Jane Smith", 60000.0, LocalDate.of(2019, 1, 1));

        Employee[] employees = new Employee[]{employee1, employee2};

        System.out.println("Years of service of " + employee1.getName() + ": " + employee1.getYearsOfService());
        System.out.println("Is " + employee1.getName() + " equal to " + employee2.getName() + "? " + employee1.equals(employee2));
	}

}
