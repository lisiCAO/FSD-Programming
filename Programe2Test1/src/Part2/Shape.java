package Part2;

import java.util.Scanner;

abstract class Shape {    //abstract class

	//abstract method
	public abstract double calculateArea();
	public abstract void displayInfo();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shape = new Shape[3]; //create an Shape array to store three objects
		
		shape[0] = new Rectangle(5.0, 3.0);//Create a `Rectangle` object with a length of 5.0 and width of 3.0.
		shape[1] = new Circle(2.5);//Create a `Circle` object with a radius of 2.5.
		
		//create a scanner to take values from user
		Scanner kb = new Scanner(System.in);
		
		// choose a shape;
		System.out.println("If you could make a shape, which one would you like to make? rectangle OR circle");
		String shapeName = kb.next();
		
		// assign values to the shape according to the choose
		char option = shapeName.toLowerCase().charAt(0);
		
		switch(option) {
		
		case 'r':
			System.out.println("Please enter the Values of Length and Width for your rectangle");
			double length = kb.nextDouble();
			double width = kb.nextDouble();
			shape[2] = new Rectangle(length, width);
			break;
			
		case 'c':
			System.out.println("Please enter the Value of Radius for your circle");
			double radius = kb.nextDouble();
			shape[2] = new Circle (radius);
			break;
			
			default:
				System.out.print("ERROR! Invalid entry");
				break;
		}
		
		//display information of three shapes
		for(Shape s: shape) {
			s.displayInfo();
			System.out.println();
		}
		
		//close
		kb.close();
		System.exit(0);
	}
}
