package part1;

public class CellPhone {
	String brand = "CC";
	long serialNumber = 100000000;
	double price = 999.99;
	
	
	public CellPhone() {
		System.out.println("CellPhone created by default");
		brand = "CC";
		serialNumber = 100000000;
		price = 999.99;
		}
	public CellPhone(String br, long sn, double pr) {
		System.out.println("Cellphone created with parameter");
		brand = br;
		serialNumber = sn;;
		price =pr;
		;
	}
	public CellPhone(CellPhone c) {
		System.out.println("CellPhone created by Copy constructor");
		brand = c.brand;
		serialNumber = c.serialNumber;
		price = c.price;
		}

	public String getBrand() {
		return brand;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setBrand(String br) {
		brand = br;
	}
	public void setSerialNumber(long sn) {
		 serialNumber = sn;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public void info() {
		System.out.print("The CellPhone selected is brand " + brand + " and serial number is " + serialNumber + " and the price is "+ price);
		
	}
	public static boolean compareCellPhone(CellPhone c1, CellPhone c2){
		if(c1.brand == c2.brand && c1.price == c2.price) {
			return true;
			}return false;	
		}
}
