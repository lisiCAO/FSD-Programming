package JavaEntityModeling;

import java.time.LocalDate;
import java.time.Period;

/**
 * The "Employee" with a name, salary, and hire date attributes, and a method to
 * calculate years of service.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 14, 2023
 */

public class Employee {
	private String name;
	private String employeeID;
	private double salary;
	private LocalDate hireDate;

	@SuppressWarnings("unused")
	private Employee() {
	};

	/**
	 * Constructs an Employee with given attributes
	 * 
	 * @param builder The builder containing the attributes
	 */
	public Employee(Builder builder) {
		this.name = builder.name;
		this.employeeID = builder.employeeID;
		this.salary = builder.salary;
		this.hireDate = builder.hireDate;

	}

	// Getter methods
	public String getName() {
		return name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Builder class for creating an Employee object
	 */
	public static class Builder {
		
		private String name;
		private String employeeID;
		private LocalDate hireDate;
		private double salary;

		public Builder(String name) {
			this.name = name;
		}

		/**
		 * Constructs the builder with the required ID attribute
		 * 
		 * @param employeeID the ID of the employee
		 */
		public Builder employeeID(String employeeID) {
			this.employeeID = employeeID;
			return this;
		}

		/**
		 * Constructs the builder with the required salary attribute
		 * 
		 * @param salary
		 */
		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder hireDate(LocalDate date) {
			this.hireDate = date;
			return this;
		}

		/**
		 * Constructs and returns an Employee object
		 * 
		 * @return Employee object
		 */
		public Employee build() {
			return new Employee(this);
		}
	}

	/**
	 * Calculate the total years that an employee served in this company
	 * 
	 * @return number of years of service
	 */
	public int getYearsOfService() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary + ", Hire Date: " + hireDate + ", Years of Service: "
				+ getYearsOfService();
	}

	private static void displayEmployeeDetails(Employee employee) {
		System.out.println("Employee ID: " + employee.getEmployeeID());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Salary: $" + employee.getSalary());
		System.out.println("Hire Date: " + employee.getHireDate());
		System.out.println("Years of Service: " + employee.getYearsOfService());
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		// Test Data
		Employee employee1 = new Employee.Builder("John Doe").employeeID("E001").salary(50000)
				.hireDate(LocalDate.of(2015, 1, 10)).build();

		Employee employee2 = new Employee.Builder("Alice Brown").employeeID("E002").salary(65000)
				.hireDate(LocalDate.of(2018, 5, 15)).build();

		Employee employee3 = new Employee.Builder("Charlie Smith").employeeID("E003").salary(70000)
				.hireDate(LocalDate.of(2020, 11, 23)).build();

		// Displaying Employee Details
		displayEmployeeDetails(employee1);
		displayEmployeeDetails(employee2);
		displayEmployeeDetails(employee3);
	}
}
