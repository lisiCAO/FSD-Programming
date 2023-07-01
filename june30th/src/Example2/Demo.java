package Example2;


public class Demo {

	public static  void ShowinfoVehicle(Vehicle v) {
		System.out.println("Here is the info : ");
		System.out.println(v);
		System.out.println("====================");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle() , v2 = new Vehicle(4,5000);
		v1.setPrice(210000);
		System.out.println("=============");
		
		System.out.println("Creating Buss");
		Bus b1 = new Bus(2,55000,35), b2 = new Bus(3,62000,55) , b3 = new Bus(b1);
		b3.setPrice(99000);
		
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
//		ShowinfoVehicle(v1);
//		ShowinfoVehicle(v2);
//		ShowinfoVehicle(b1);
//		ShowinfoVehicle(b2);
//		ShowinfoVehicle(b3);
//		ShowinfoVehicle(c1);
//		ShowinfoVehicle(c2);
//		ShowinfoVehicle(sc1);
//		ShowinfoVehicle(sc2);
//		ShowinfoVehicle(rc1);
//		ShowinfoVehicle(rc2);
		
		System.out.println("=============");
		System.out.println("=============");
		
		System.out.println("==Compare v1 and v2==");
		v1.isCheaper(v2);
		
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=============");
		
		
		System.out.println("==Compare v2 and rc1==");
		v2.isCheaper(rc1);
		
		
		System.out.println("==Compare rc1 and c1==");
		rc1.isCheaper(c1);
	}

}