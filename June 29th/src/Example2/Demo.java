package Example2;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle() , v2 = new Vehicle();
		System.out.println("=============");
		
		System.out.println("Creating Buss");
		

		Bus b1 = new Bus(2,55000,35), b2 = new Bus(3,62000,55) , b3 = new Bus(b1);
		b3.setPrice(99000);

		System.out.println("the info of the Buses");
		System.out.println("here is the info of b1  :   " + b1);
		System.out.println("here is the info of b2  :   " + b2);
		System.out.println("here is the info of b3  :   " + b3);
		
		
		
	}

}
