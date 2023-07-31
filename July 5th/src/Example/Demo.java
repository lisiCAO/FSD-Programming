package Example;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Benz",4);
		Bus b1 = new Bus("Toyota",2,55);
		
		Vehicle[] myarr = new Vehicle[2];
		
		myarr[0] = c1;
		myarr[1] = b1;
		
		for(int i=0 ;i < myarr.length ; i++) {
			myarr[i].start();
			myarr[i].stop();
		}
		
		c1.accelerate();
		b1.accelerate();
		c1.brake();
		b1.brake();
		
	
	}

}