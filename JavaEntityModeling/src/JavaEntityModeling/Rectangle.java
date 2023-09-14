package JavaEntityModeling;

/**
 * The `Rectangle` class with width and height attributes. Calculate the area
 * and perimeter of the rectangle.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 13, 2023
 */

public class Rectangle {
	private double width;
	private double height;

	private Rectangle() {
	};

	// Builder method, once using , other public constructors should be private and
	// remove setter
	private Rectangle(Builder builder) {
		this.width = builder.width;
		this.height = builder.height;
	}

	// Getters
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// Setters
	public void setWidth(double wd) {
		width = wd;
	}

	public void setHeight(double ht) {
		height = ht;
	}

	public static class Builder {
		private double width;
		private double height;

		public Builder() {
		}

		public Builder width(double width) {
			this.width = width;
			return this;
		}

		public Builder height(double height) {
			this.height = height;
			return this;
		}

		public Rectangle build() {
			return new Rectangle(this);
		}
	}
	
    /**
     * Calculates and returns the area of the rectangle.
     * 
     * @return area of the rectangle
     */
	public double calculateArea() {
		return width * height;
	}

    /**
     * Calculates and returns the perimeter of the rectangle.
     * 
     * @return perimeter of the rectangle
     */
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

	public static void main(String[] args) {
        // Test data
        Rectangle rectangle1 = new Builder().width(3).height(9.5).build();
        Rectangle rectangle2 = new Builder().width(5).height(10).build();

        // Prints results of area and perimeter for rectangle1
        System.out.println("Rectangle 1 - Area: " + rectangle1.calculateArea());
        System.out.println("Rectangle 1 - Perimeter: " + rectangle1.calculatePerimeter());

        // Prints results of area and perimeter for rectangle2
        System.out.println("Rectangle 2 - Area: " + rectangle2.calculateArea());
        System.out.println("Rectangle 2 - Perimeter: " + rectangle2.calculatePerimeter());
    }


}
