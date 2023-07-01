package Example1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(), v2 = new Vehicle(4, 5000);

		System.out.println();
		
		Bus b1 = new Bus(), b2 = new Bus(55, 3, 65000), b3 = new Bus(b1);
		System.out.println("Here is the information of b1" + b1);
		System.out.println("Here is the information of b2" + b2);
		System.out.println("Here is the information of b2" + b2);

	}

}
