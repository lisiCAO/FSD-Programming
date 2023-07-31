package Part2;

public class Rectangle extends Shape{
	private double length;// Represents the length of the rectangle.
	private double width;// Represents the width of the rectangle.
	
	//parameter constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width =width;
	}
	
	@Override
	public double calculateArea() {
		double area = length * width;
		return area;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Rectangle:");
		System.out.println("The length " + length + "\nThe width: " + width + "\nThe area is " + calculateArea());
	}
	

}
