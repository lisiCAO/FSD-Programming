package JavaEntityModeling;

public class Circle {
	private double radius; // create an attribute radius
	
	// create a constructor
	public Circle(double r) { 
		this.radius =r;
	}
	
	//getter
	public double getRadius() {
		return radius;
	}
	
	//setter
	public void setRadius(double r) {
		this.radius = r;
	}
	
	//method to calculate area
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	//method to calculate circumference
	public double calculateCircumference() {
		return Math.PI * 2 * radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(3); // create an object Circle with radius 3
		
		//print the result of area and circumference
		System.out.println("Area: " + c.calculateArea());
		System.out.println("Circumference: " + c.calculateCircumference());
	}

}
