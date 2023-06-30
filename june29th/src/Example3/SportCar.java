package Example3;

public class SportCar extends Car{
	private double gasConsumption;
	
	public SportCar() {// default
		System.out.println("Creating SportCar from default con");
		gasConsumption = 4;
		
	}

	public SportCar(int nd, double pr , int ns , double gc) {// parameter cons
		super(nd,pr,ns);
		System.out.println("Creating SportCar from parameter con");
		gasConsumption = gc;
	}
	
	public SportCar(SportCar sc) {//copy cons
		System.out.println("Creating SportCar from copy con");
		setNumOfDoor(sc.getNumOfDoor());
		setPrice(sc.getPrice());
		setnumOFSeats(sc.getnumOFSeats());
		gasConsumption = sc.gasConsumption;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public void setGasConsumption(double gc) {
		gasConsumption = gc;
	}

	@Override
	public String toString() {
		return "SportCar has" + gasConsumption 
				+ "gasconsumption with" + getnumOFSeats() + " number of seat,and "
				+ getNumOfDoor() + " doors, with price of  " + getPrice() + "$";
	}
	
}
