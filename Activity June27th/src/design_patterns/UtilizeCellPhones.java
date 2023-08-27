package design_patterns;

public class UtilizeCellPhones {

	public static void main(String[] args) {
		
		// Using default constructor
		System.out.println("CellPhone created by default");
		CellPhone c1 = new CellPhone();
		System.out.println("CellPhone c1: " + c1.toString() + "\n");

		// Using parameterized constructor
		System.out.println("Cellphone created with parameter");
		CellPhone c2 = new CellPhone("CL", 123456789, 1999.99);
		System.out.println("CellPhone c2: " + c2.toString() + "\n");

		// Using copy constructor
		System.out.println("CellPhone created by Copy constructor");
		CellPhone c3 = new CellPhone(c1);
		System.out.println("CellPhone c3 (Copy of c1): " + c3.toString() + "\n");

		// Modifying objects using setters
		c1.setPrice(1999.99);
		c2.setPrice(995.98);
		c2.setBrand("Lq");
		c3.setSerialNumber(987654321);

		System.out.println("The price of CellPhone 1 is " + c1.getPrice());
		System.out.println("The price of CellPhone 2 is " + c2.getPrice());
		System.out.println("The brand of CellPhone 2 is " + c2.getBrand()); // corrected from getPrice() to getBrand()
		System.out.println("The serial number of CellPhone 3 is " + c3.getSerialNumber() + "\n");

		// Comparing objects
		if (c1.equals(c2)) {
			System.out.println("Cell phone 1 and cell phone 2 are equal");
		} else {
			System.out.println("Cell phone 1 and cell phone 2 are not equal");
		}

		// Utilizing the Builder pattern
		CellPhone c4 = new CellPhone.Builder("BuilderBrand").price(499.99).serialNumber(11111111).build();

		System.out.println("CellPhone c4 (Built using Builder): " + c4.toString());
	}
}
