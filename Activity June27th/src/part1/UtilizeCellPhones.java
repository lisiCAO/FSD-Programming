package part1;

public class UtilizeCellPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone c1 = new CellPhone();
		c1.info();
		CellPhone c2 = new CellPhone("CL", 123456789, 1999.99);
		c2.info();
		CellPhone c3 = new CellPhone(c1);
		c3.info();
		c1.setPrice(1999.99);
		c2.setPrice(995.98);
		c2.setBrand("Lq");
		c3.setSerialNumber(987654321);
		System.out.println("The price of CellPhone 1  is " + c1.price);
		System.out.println("The price of CellPhone 2  is " + c2.price);
		System.out.println("The brand of CellPhone 2  is " + c2.brand);
		System.out.println("The serial number of CellPhone 3  is " + c3.serialNumber);
		
		if(CellPhone.compareCellPhone(c1, c2)) {
			System.out.println("Cell phone 1 and cell phone 2 is equal");
		}else {
			System.out.println("Cell phone 1 and cell phone 2 is not equal");
		}
	}

}
