//_______________________________________________________
//Assignment 1
//© Lisi Cao
//Written by: Lisi Cao 2387145
//_______________________________________________________
//This is a Computer inventory system, help store owner edit and track the information of computer in stock
package assignment1;

import java.util.Objects;
import java.util.Scanner;

//Password System
class PasswordSystem {
	private static final String PASSWORD = "password";
	private static final int MAX_ATTEMPTS = 3;
	private int remainingAttempts;
	private String password;

	public PasswordSystem() {
		this.remainingAttempts = MAX_ATTEMPTS;
	}

	// method to prompt user for password
	public void inputPassword() {
		password = null;
		if (remainingAttempts == 0) {
			System.out.println("You have reached the maximum attempts. \n---return to main menu.---");
		} else {
			System.out.println("Please enter your password: ");
			password = Computer.kb.next();
		}
	}

	// method to validate password
	public boolean validatePassword() {

		while (remainingAttempts > 0) {
			remainingAttempts--;
			if (password.equals(PASSWORD)) {
				return true;
			} else {
				System.out.println("Incorrect password. You have " + remainingAttempts + " attempt(s) left.");
				inputPassword();
			}
		}
		return false;
	}
}

//Computer class
public class Computer {
	private String brand;
	private String model;
	private double price;
	private long sN; // SN indicates the serial number of the computer.
	private static int numOfCreatedComputers = 0;
	static Scanner kb = new Scanner(System.in);
	private static int userChoiceForMainMenu = 0;
	private static int userChoiceForUpdateMenu = 0;

	// default constructor
	public Computer() {
		brand = "apple";
		model = "macbook pro";
		price = 2498;
		sN = 1000000;
		numOfCreatedComputers++;
	}

	// parameter constructor
	public Computer(String br, String md, double pr, Long sN) {
		this.brand = br;
		this.model = md;
		this.price = pr;
		this.sN = sN;
		numOfCreatedComputers++;
	}

	// copy constructor
	public Computer(Computer c) {
		this.brand = c.brand;
		this.model = c.model;
		this.price = c.price;
		this.sN = c.sN;
		numOfCreatedComputers++;
	}

	// @return the brand
	public String getBrand() {
		return brand;
	}

	// @param brand the brand to set
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// @return the model
	public String getModel() {
		return model;
	}

	// @param model the model to set
	public void setModel(String model) {
		this.model = model;
	}

	// @return the price
	public double getPrice() {
		return price;
	}

	// @param price the price to set
	public void setPrice(double price) {
		this.price = price;
	}

	// @return the SN
	public long getSN() {
		return sN;
	}

	// @param sN the SN to set
	public void setSN(long sN) {
		this.sN = sN;
	}

	// display computer information
	public String toString(int index) {
		return "Computer#" + index + "\n" + "Brand: " + brand + "\n" + "Model: " + model + "\n" + "SN: " + sN + "\n"
				+ "Price: $" + price;
	}

	// method to track the number of computer.
	public int findNumberOfCreatedComputers() {
		return numOfCreatedComputers;
	}

	// override equals method, compare brand, model and price.
	@Override
	public int hashCode() {
		return Objects.hash(brand, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	// main menu
	public static void printMainMenu() {
		System.out.println("Main Menu");
		System.out.println("---------------------");
		System.out.println("What do you want to do?");
		System.out.println("	1. Enter new computers(password required)");
		System.out.println("	2. Change information of a computer (password required)");
		System.out.println("	3. Display all computers by a specific brand");
		System.out.println("	4. Display all computers under a certain a price.");
		System.out.println("	5. Quit");
		System.out.println("Please enter your choice (1 to 5) > ");
		userChoiceForMainMenu = kb.nextInt();
		System.out.println();
	}

	// update menu
	public static void printUpdateMenu() {
		System.out.println("What information would you like to change?");
		System.out.println("	1. brand");
		System.out.println("	2. model");
		System.out.println("	3. SN");
		System.out.println("	4. price");
		System.out.println("	5. Quit");
		System.out.println("Enter your choice >");
		userChoiceForUpdateMenu = kb.nextInt();
		System.out.println();
	}

	// method to add information of computer
	public static void addComputer(int numOfComputerAdded, Computer[] inventory) {

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null && numOfComputerAdded > 0) {
				int n = i + 1;
				System.out.println("Enter brand, model, price and SN of the computer " + n + " :");
				String br = kb.next();
				String md = kb.next();
				double pr = kb.nextDouble();
				long SN = kb.nextLong();
				inventory[i] = new Computer(br, md, pr, SN);
				numOfComputerAdded--;
			}
		}
		System.out.println("Information of computers have been added. \n Return to main menu.");
	}

	// method to validate the input index
	public static int getValidIndexOfComputer(Computer[] inventory) {

		int indexOfComputer = kb.nextInt();

		while (indexOfComputer >= inventory.length || indexOfComputer < 0) {
			System.out.println("Please re-enter a valid index (between 0 to " + inventory.length + ")");
			indexOfComputer = kb.nextInt();
		}
		return indexOfComputer;
	}

	public static int indexWithInformation(Computer[] inventory) {
		char option;
		boolean running = true;
		int index = getValidIndexOfComputer(inventory);

		// solution to null position,choose a new position or return to main menu
		while (running && inventory[index] == null) {
			System.out.println("There is no Computer information in this index position.");
			System.out.println("Would you like to enter a new computer number? yes / no");
			option = kb.next().toLowerCase().charAt(0);// unify the option
			switch (option) {
			case 'y':
				System.out.println("Please enter the new computer number that you want to update:");
				getValidIndexOfComputer(inventory);
				break;
			case 'n':
				index = -1;
				running = false;
				break;
			default:
				System.out.println("ERROR! INVALID ENTRY!");
				continue;
			}
		}
		return index;
	}

	// method to display computers by Brand selected
	public static void findComputersBy(String br, Computer[] inventory) {
		String other = br.toLowerCase();
		boolean found = false;
		boolean foundBrand = false;
		br.toLowerCase();
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				if (inventory[i].getBrand().toLowerCase().equals(other)) {
					System.out.println(inventory[i].toString(i) + "\n");
					found = true;
					foundBrand = true;
				}
			}
		}
		if (!foundBrand) {
			System.out.println("There is no such brand of computers.");
		}
		if (!found) {
			System.out.println("There is no computer with the brand: " + br + "\n");
		}
	}

	// method to display computers cheaper than input price
	public static void findCheaperThan(double pr, Computer[] inventory) {
		boolean found = false;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				if (Double.compare(inventory[i].getPrice(), pr) == -1) {
					System.out.println(inventory[i].toString(i) + "\n");
					found = true;
					found = true;
				}
			}
		}
		if (!found) {
			System.out.println("There is no computers under " + pr + " $ .");
		}
		if (!found) {
			System.out.println("There is no computer under the price: " + pr + "\n");
		}
	}

	@Override
	public String toString() {
		return "Computer [" + (brand != null ? "brand=" + brand + ", " : "")
				+ (model != null ? "model=" + model + ", " : "") + "price=" + price + ", sN=" + sN + "]";
	}

	public static void main(String[] args) {

		PasswordSystem checkPassword = new PasswordSystem();// create an Password object
		System.out.println("Welcome to inventory's system!");// welcome message.

		// prompt the store owner for the max number of computers the store can contain.
		System.out.println("Please enter the maximum number of computers that your store can contain:");
		int maxComputers = kb.nextInt();
		Computer[] inventory = new Computer[maxComputers]; // create an array - inventory - with the size of
															// inventory
		System.out.println("Maximum number of computers: " + maxComputers + "\n");// confirm the information

		// build 5 options.
		while (true) {
			// display main menu and prompt user for the choice.
			printMainMenu();
			switch (userChoiceForMainMenu) {
			case 1: // check password validity
				checkPassword.inputPassword();
				if (!checkPassword.validatePassword()) {
					continue;
					// prompt user for numbers of computer to add
				} else {
					System.out.println("How many computers do you want to add? ");
					int numOfComputerAdded = kb.nextInt();
					// check availability of empty space
					int emptyCount = 0;
					for (int i = 0; i < inventory.length; i++) {
						if (inventory[i] == null) {
							emptyCount++;
						}
					}
					// compare empty space and numbers to be added
					if (emptyCount < numOfComputerAdded) {
						System.out.println(
								"Only " + emptyCount + " empty space left in the inventory, and you can only add"
										+ emptyCount + " computers.");
						numOfComputerAdded = emptyCount;
					} else {
						System.out.println("You can add " + numOfComputerAdded + " computers.");
					}
					addComputer(numOfComputerAdded, inventory); // add information of computer
					// add information of computer
					addComputer(numOfComputerAdded, inventory);
					break;
				}
			case 2: // update attributes of computers
				checkPassword.inputPassword(); // input password
				// validate password
				if (!checkPassword.validatePassword()) {
					continue;
				} else {
					// prompt user for the index of computer to update
					System.out.println("Please enter the computer number that you want to update:");
					int indexOfComputer = kb.nextInt();

					// check validity of index
					while (indexOfComputer >= maxComputers || indexOfComputer < 0) {
						System.out.println("Please re-enter a valid index (between 0 to " + maxComputers);
						indexOfComputer = kb.nextInt();
					}
					// solution to null position,choose a new position or return to main menu
					while (inventory[indexOfComputer] == null) {
						System.out.println(
								"There is no Computer information in this index position, would you like to enter a new computer number? yes / no");
						char option = kb.next().toLowerCase().charAt(0); // unify the option
						if (option == 'y') {
							System.out.println("Please enter the new computer number that you want to update:");
							indexOfComputer = kb.nextInt(); // obtain a new index of computer
						} else if (option == 'n') {
							printMainMenu(); // return to main menu
							break;
						} else {
							System.out.println("Please answer the question by YES/ NO");
							option = kb.next().toLowerCase().charAt(0);
						}
					}
					// print computer's information when index is valid
					System.out.println(inventory[indexOfComputer].toString(indexOfComputer) + "\n");
					// get valid index

					boolean running;
					int index;

					if (indexWithInformation(inventory) != -1) {
						index = indexWithInformation(inventory);
						// execute update menu until exit
						running = true;
					} else {
						running = false;
						break;
					}

					while (running) {
						System.out.println(inventory[index].toString(index) + "\n");// print computer's information
																					// when index is valid
						printUpdateMenu();
						switch (userChoiceForUpdateMenu) {
						case 1:// update brand
							System.out.println("Enter the new brand");
							String br = kb.next();
							inventory[indexOfComputer].setBrand(br);
							System.out.println(inventory[indexOfComputer].toString(indexOfComputer) + "\n");
							inventory[index].setBrand(br);
							break;
						case 2:// update model
							System.out.println("Enter the new model");
							String md = kb.next();
							inventory[indexOfComputer].setBrand(md);
							System.out.println(inventory[indexOfComputer].toString(indexOfComputer) + "\n");
							inventory[index].setBrand(md);
							break;
						case 3:// update serial number
							System.out.println("Enter the new SN");
							long sN = kb.nextLong();
							inventory[indexOfComputer].setSN(sN);
							System.out.println(inventory[indexOfComputer].toString(indexOfComputer) + "\n");
							inventory[index].setSN(sN);
							break;
						case 4:// update price
							System.out.println("Enter the new price");
							double pr = kb.nextDouble();

							inventory[indexOfComputer].setPrice(pr);
							System.out.println(inventory[indexOfComputer].toString(indexOfComputer) + "\n");
							inventory[index].setPrice(pr);

							break;
						case 5:// return to main menu
							System.out.println("Return to Main Menu");
							running = false; // change the condition of while loop
							break;
						default:// validate choice entry
							System.out.println("INVALID ENTRY.\n");
							break;
						}
						printUpdateMenu();
					}
				}
				break;// exit while(running) loop
			case 3: // prompt user for brand name and find computer by brand
				System.out.println("Please enter the BRAND of computer that you would like to search:");
				String br = kb.next();
				findComputersBy(br, inventory);
				break;
			case 4:// prompt user for maximum price that customer could bear and find computer by
					// price
				System.out.println("Please enter maximum budget:");
				double pr = kb.nextDouble();
				findCheaperThan(pr, inventory);
				break;
			case 5:// closing message and exit
				System.out.println("System closed. Thanks for using Computer System!");
				kb.close();
				System.exit(0);
				break;
			default:// validate the choice that users enter
				System.out.println("INVALID ENTRY.\n");
			}
		}
	}
}
