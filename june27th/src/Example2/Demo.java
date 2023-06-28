package Example2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle(3, 4000, 500);
		
		v4.info();
		
		System.out.println("information of V1 before chaging");
		v1.info();
		System.out.println("================================");
		System.out.println("information of V2 before chaging");
		v2.info();
		System.out.println("================================");
		System.out.println("information of V3 before chaging");
		v3.info();
		System.out.println("================================");
		
		v1.setNumOfDoor(5);
		v1.setPrice(25000);
		v1.setMaxSpeed(200);
		
		v2.setNumOfDoor(2);
		v2.setPrice(2500);
		v2.setMaxSpeed(210);
		
		v3.setNumOfDoor(3);
		v3.setPrice(1000);
		v3.setMaxSpeed(220);
		
		
		
		Scanner kb =new Scanner(System.in);
		System.out.println("Please give me the maximum price, minimum number of doors and maximum speed you are looking for");
		double pr = kb.nextDouble();
		int nd =  kb.nextInt();
		int ms = kb.nextInt();
		boolean found = false;
		if(v1.getPrice() < pr && v1.getNumOfDoor() > nd && v1.getMaxSpeed() >= ms) {
			found =true;
			System.out.println("vehicle found with this info");
			v1.info();
		}
		if(v2.getPrice() < pr && v2.getNumOfDoor() > nd && v2.getMaxSpeed() >= ms) {
			found =true;
			System.out.println("vehicle found with this info");
			v2.info();
		}
		if(v3.getPrice() < pr && v3.getNumOfDoor() > nd && v3.getMaxSpeed() >= ms) {
			found =true;
			System.out.println("vehicle found with this info");
			v3.info();
		}
		if(!found) {
			System.out.println("I didn't found anything");
		}
		kb.close();

		
	}

}
