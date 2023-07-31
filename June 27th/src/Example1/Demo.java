package Example1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner kb =  new Scanner
		
//		Vehicle v1 =  new Vehicle();
//		int numdoor = v1.getNumOfDoor();
//		System.out.println(numdoor);
//		v1.setNumOfDoor(9);
//		v1.info();

		Vehicle v1 =  new Vehicle();
		Vehicle v2 =  new Vehicle();
		Vehicle v3 =  new Vehicle();
		
		System.out.println("information of V1 before chaging");
		System.out.println("================================");
		System.out.println("information of V2 before chaging");
		System.out.println("================================");
		System.out.println("information of V3 before chaging");
		System.out.println("================================");
		
		v1.setNumOfDoor(5);
		v1.setPrice(25000);
		v1.setMaxSpeed(200);
		
		Vehicle v4 =  new Vehicle();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me price, number of door and maximum speed");
		double pr = kb.nextDouble();
		int nd = kb.nextInt();
		int ms = kb.nextInt();
		v4.numOfDoor =-3;
		if(pr > 0) {
			v4.setPrice(pr);
		}
		v4.info();
	}

}
