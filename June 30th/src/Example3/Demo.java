package Example3;

public class Demo {
	
	public static void ShowinfoVehicle(Vehicle v) {
		System.out.println("Here is the info : ");
		System.out.println(v);
		System.out.println("====================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle() , v2 = new Vehicle(4,5000);
		
		v1.DisplayNumberOfObject();
		
		System.out.println("=============");
		
		System.out.println("Creating Buss");
		Bus b1 = new Bus(2,55000,35), b2 = new Bus(3,62000,55) , b3 = new Bus(b1);
		
	
		v1.DisplayNumberOfObject();
		
		b1.DisplayNumberOfObject();

		System.out.println("=============");
		System.out.println("Creating Car");
		Car c1 = new Car(4,12000,5),c2 = new Car(2,2200,3);
		
		System.out.println("=============");
		System.out.println("Creating Spor Car");
		SportCar sc1 = new SportCar(4,78000,2,3);
		SportCar sc2 = new SportCar(3,85000,4,4);
		
		System.out.println("=============");
		System.out.println("Creating Race Car");
		RaceCar rc1 = new RaceCar(4,30000,2,4,500) ,rc2 = new RaceCar(3,890000,4,4,250);
		c1.DisplayNumberOfObject();
		
		sc1.DisplayNumberOfObject();
		
		
		
		
		
	}

}
