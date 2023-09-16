package JavaEntityModeling;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

/**
 * The "Employee Manager" has a Map attribute to store Employee object, and offer equals method.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 14, 2023
 */

/**
 * Manages employees and provides utility methods for comparing and displaying
 * employee data.
 */
public class EmployeeManager {

	private Map<String, Employee> employees;

	public EmployeeManager() {
		this.employees = new HashMap<>();
	}

	/**
	 * Adds an employee to the manager.
	 * 
	 * @param employee The employee to be added.
	 */
	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeID(), employee);
	}

	/**
	 * Removes an employee from the manager using the employee ID.
	 * 
	 * @param employeeId The ID of the employee to be removed.
	 */
	public void removeEmployee(String employeeId) {
		employees.remove(employeeId);
	}

	/**
	 * Compares the years of service between two employees.
	 * 
	 * @param e1 First employee.
	 * @param e2 Second employee.
	 * @return Positive value if e1 has more years of service, negative if less, and
	 *         0 if equal.
	 */
	public int compareYearsOfService(Employee e1, Employee e2) {
		return e1.getYearsOfService() - e2.getYearsOfService();
	}

	/**
	 * Compares the salary between two employees.
	 * 
	 * @param e1 First employee.
	 * @param e2 Second employee.
	 * @return Positive value if e1 has a higher salary, negative if less, and 0 if
	 *         equal.
	 */
	public int compareSalary(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
	}

	@Override
	public String toString() {
		StringBuilder display = new StringBuilder("EmployeeManager:\n");
		for (Map.Entry<String, Employee> entry : employees.entrySet()) {
			display.append("Employee ID: ").append(entry.getKey()).append("\nEmployee Details: ")
					.append(entry.getValue().toString()).append("\n--------------------------\n");
		}
		return display.toString();
	}

	public static void main(String[] args) {
		Employee e1 = new Employee.Builder("John").salary(50000).hireDate(LocalDate.of(2015, 1, 1)).employeeID("E001")
				.build();

		Employee e2 = new Employee.Builder("Jane").salary(55000).hireDate(LocalDate.of(2018, 1, 1)).employeeID("E002")
				.build();

		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee(e1);
		manager.addEmployee(e2);

		System.out.println(manager);

		// Compare employees based on years of service
		int diffYear = manager.compareYearsOfService(e1, e2);
		if (diffYear > 0) {
			System.out.print(e1.getName() + "stay in the company longer than " + e2.getName());
		} else if (diffYear < 0) {
			System.out.print(e2.getName() + "stay in the company longer than " + e1.getName());
		} else {
			System.out.print(e1.getName() + " and " + e2.getName() + " have the same service years.");
		}

		// Compare employees based on salary
		int salaryComparison = manager.compareSalary(e1, e2);
		if (salaryComparison == 0) {
			System.out.println(e1.getName() + " and " + e2.getName() + " have the same salary.");
		} else if (salaryComparison > 0) {
			System.out.println(e1.getName() + " has a higher salary than " + e2.getName());
		} else {
			System.out.println(e2.getName() + " has a higher salary than " + e1.getName());
		}
	}
}
