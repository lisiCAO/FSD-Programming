package Example1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		Vehicle	v2 = new Vehicle();
		Vehicle	v3 = new Vehicle();
		System.out.println("the info or vehicle before changing");
		System.out.println("=====================");
		System.out.println("vehicle 1");
		v1.info();
		System.out.println("=====================");
		System.out.println("vehicle 2");
		v2.info();
		System.out.println("=====================");
		System.out.println("vehicle 3");
		v3.info();
		
		v1.setNumOfDoor(3);
		v1.setMaxSpeed(280);
		v1.setPrice(10000);
		
		v2.setNumOfDoor(2);
		v2.setPrice(2500);
		v2.setMaxSpeed(210);
		
		v3.setNumOfDoor(3);
		v3.setPrice(1000);
		v3.setMaxSpeed(220);
		
		if(v1.equals(v2) == true) {
			System.out.println("v1 and v2 are equals");
		}else {
			System.out.println("v1 and v2 are NOT equals");
		}
		if(v1.equals(v3) == true) {
			System.out.println("v1 and v3 are equals");
		}else {
			System.out.println("v1 and v3 are NOT equals");
		}
		if(v3.equals(v2) == true) {
			System.out.println("v3 and v2 are equals");
		}else {
			System.out.println("v3 and v2 are NOT equals");
		}
	}

}
