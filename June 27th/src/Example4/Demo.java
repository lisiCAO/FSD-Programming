package Example4;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(5,25000,260),
				v2 = new Vehicle(3,10000,220);
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle(v1);
		Vehicle v5 = new Vehicle(v2);
		Vehicle v6 = new Vehicle(v3);
		Vehicle v7 = new Vehicle();
		
		
		Vehicle[] myVehiclearray = new Vehicle[7];
		myVehiclearray[0] = v1;
		myVehiclearray[1] = v2;
		myVehiclearray[2] = v3;
		myVehiclearray[3] = v4;
		myVehiclearray[4] = v5;
		myVehiclearray[5] = v6;
		myVehiclearray[6] = v7;
		
		for(Vehicle x : myVehiclearray) {
			x.info();
		}
	}

}