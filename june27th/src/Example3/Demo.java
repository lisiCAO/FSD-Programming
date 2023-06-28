package Example3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vehicle v1 = new Vehicle(5,25000,260);
	Vehicle v2 = new Vehicle(3,10000,220);
	Vehicle v3 = new Vehicle();
	
	Vehicle[] myVehicleArray = new Vehicle[3];
	myVehicleArray[0] = v1;
	myVehicleArray[1] = v2;
	myVehicleArray[2] = v3;
	for(Vehicle x: myVehicleArray) {
		x.info();
	}
	
	System.out.println("information of V1");
	v1.info();
	System.out.println("==================");
	System.out.println("information of V2");
	v2.info();
	System.out.println("==================");
	System.out.println("information of V3");
	v3.info();
	System.out.println("==================");
	
	Vehicle v4 = new Vehicle(v1);
	System.out.println("information of V4");
	v4.info();
	}

}
