package Example4;

public class Demo {

	public static void showinfo(Vehicle v) {
		System.out.println("here is the info");
		System.out.println(v);
		System.out.println();
	}
	
	public static void displayinventory(Vehicle[] va) {
		System.out.println("Here of inventory info");
		for(int i=0 ; i< va.length ; i++) {
			System.out.println("the vehicle number  " + (i+1));
			System.out.println(va[i]);
		}
	}
	
	public static Vehicle[] copyinventory1(Vehicle[] va) {
		
		Vehicle[] vararr = va;
		return vararr;
		
	}
	
	
	public static Vehicle[] copyinventory2(Vehicle[] va) {
		
		Vehicle[] vararr = new Vehicle[va.length];
		for(int i = 0 ; i < vararr.length ; i++) {
			//vararr[i] = new Vehicle[va[i]];
			vararr[i] = va[i].clone();
		}
		return vararr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(), v2 = new Vehicle(4, 5000), v3 = new Vehicle(v2);

		System.out.println();
		System.out.println("Will create three Bus objects");

		Bus b1 = new Bus(2, 55000, 37), b2 = new Bus(3, 62000, 55), b3 = new Bus(b1);

		System.out.println();
		System.out.println("Will create two Car objects");

		Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 26000, 2);

		System.out.println();
		System.out.println("Will create three Sport Car objects");

		SportCar sc1 = new SportCar(4, 12000, 5, 3), sc2 = new SportCar(3, 18500, 4, 4),
				sc3 = new SportCar(2, 15000, 5, 4);

		System.out.println();
		System.out.println("Will create two Race Car objects");

		RaceCar rc1 = new RaceCar(4, 67000, 2, 4, 400), rc2 = new RaceCar(3, 85000, 4, 4, 450);
		

		System.out.println("Lets Create the inventory of All Vehicle");
		
		Vehicle[] vehinv1 = new Vehicle[6];
		vehinv1[0] = v1;
		vehinv1[1] = b1;
		vehinv1[2] = b2;
		vehinv1[3] = sc1;
		vehinv1[4] = sc2;
		vehinv1[5] = rc1;
		
		displayinventory(vehinv1);
		
		Vehicle[] vehin2 = copyinventory2(vehinv1);
		
	
		Vehicle vb = new Bus();//casting accepted
		//Bus bv = new Vehicle();//casting is not accepted
		Car cs = new SportCar();
		//SportCar sc = new Car();not accapteble 
		
		
		System.out.println("*****************************");
		displayinventory(vehin2);
		vehinv1[3] = sc2;
	}

}
