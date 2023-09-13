package JavaEntityModeling;

public class Rectangle {
	private double width;
	private double height;
	
	//constructor
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	//getters
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	//setters
	public void setWidth(double wd) {
		 width = wd;
	}
	public void setHeight(double ht) {
		height =ht;
	}
	
	// method to calculate area
	public double calculateArea() {
		return width * height;
	}
	
	//method to calculate perimeter
	public double calculatePerimeter() {
		return 2 * (width + height);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(3, 9); //create an Object rectangle with width = 3 and height = 9
		
		// print results of area and perimeter
		System.out.println("Area:" + rectangle.calculateArea());
		System.out.println("Perimeter:" + rectangle.calculatePerimeter());
	}

}
