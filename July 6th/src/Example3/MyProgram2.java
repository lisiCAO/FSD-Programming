package Example3;
class GenTwo<T, S> {
	private T x;
	private S y;

	public GenTwo() {
		x = null;
		y = null;
	}

	public GenTwo(T v1, S v2) {
		x = v1;
		y = v2;
	}

	public GenTwo(GenTwo g) {
		x = (T) g.x;
		y = (S) g.y;
	}

	public T getX() {
		return x;
	}

	public void setX(T v) {
		x = v;
	}

	public S getY() {
		return y;
	}

	public void setY(S v) {
		y = v;
	}

	@Override
	public String toString() {
		return (x.toString() + "  " + y.toString());
	}

	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		} else {

			GenTwo<T, S> g1 = (GenTwo<T, S>) obj;
			if (x.equals(g1.x) && y.equals(g1.y)) {
				return true;
			} else {
				return false;
			}
		}

	}
}

class Car {// Attributes
	private int numOfDoors;
	private double price;
	private int numOfSeats;

	// Constructors
	public Car() {
		numOfDoors = 4;
		price = 10000;
		numOfSeats = 5;
	}

	public Car(int nd, double pr, int ns) {
		numOfDoors = nd;
		price = pr;
		numOfSeats = ns;
	}

	public Car(Car c) {
		numOfDoors = c.numOfDoors;
		price = c.price;
		numOfSeats = c.numOfSeats;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int nd) {
		numOfDoors = nd;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int ns) {
		numOfSeats = ns;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice()
				+ "$. The number of seats of this car is " + numOfSeats + ".";
	}

	public boolean equals(Car c) {
		return (price == c.price && numOfDoors == c.numOfDoors && numOfSeats == c.numOfSeats);
	}

}

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Pargol", name2 = "Pargol";
		Long id1 = 123456l, id2 = 123456l;
		
		GenTwo<Long,String> st1 = new GenTwo<Long,String>(id1,name1);
		GenTwo<Long,String> st2 = new GenTwo<Long,String>(id2,name2);
		
		GenTwo<String,String> st3  = new GenTwo<String,String>("PArgol","Poshtareh");
		
		
//		if(st1.equals(st3)) {
//			System.out.println("yes you ar e equals");
//		}else {
//			System.out.println("Nope");
//		}
		
		
		Integer yearcar1 = 2002;
		Integer yearcar2 = 2023;
		Integer yearcar3 = 2002;
		
		Car c1 = new Car(2,10000,5),c2 = new Car(4,3000,2),c3 = new Car(2,10000,5);
		
		GenTwo<Car,Integer> cm1 = new GenTwo<Car,Integer>(c1,yearcar1);
		GenTwo<Car,Integer> cm2 = new GenTwo<Car,Integer>(c2,yearcar2);
		GenTwo<Car,Integer> cm3 = new GenTwo<Car,Integer>(c3,yearcar3);
		
		
		if(cm1.getX().equals(cm2.getX())&& cm1.getY().equals(cm2.getY())) {
			System.out.println("yes you ar e equals");
		}else {
			System.out.println("Nope");
		}
		
		
		if(cm1.getX().equals(cm3.getX())&& cm1.getY().equals(cm3.getY())) {
			System.out.println("yes you ar e equals");
		}else {
			System.out.println("Nope");
		}

	}

}