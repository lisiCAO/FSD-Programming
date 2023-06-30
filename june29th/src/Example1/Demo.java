package Example1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create vehicle");
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(4, 5000);
		System.out.println("==============");
		System.out.println("the info of vehicle");
		System.out.println("here is the info of v1: " + v1);
		System.out.println("here is the info of v2: " + v2);
		
		System.out.println("==============================");
		System.out.println("Create Bus");
		
		Bus b1 = new Bus(), b2 =new Bus(50), b3 =  new Bus(b1);
		System.out.println("here is the info of b1: " + b1);
		System.out.println("here is the info of b2: " + b2);
		System.out.println("here is the info of b3: " + b3);
		
		b1.setNumOfDoor(2);
		b1.setprice(60000);
		b1.setPassengerCapacity(33);
		
		


	}

}
