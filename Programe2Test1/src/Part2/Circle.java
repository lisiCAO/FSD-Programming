package Part2;

public class Circle extends Shape{
	private double radius; // Represents the radius of the circle.
	
	//parameter constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Circle:");
		System.out.println("The radius " + radius + "\n" + "The area is " + calculateArea());
	}
	

}
