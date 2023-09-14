package JavaEntityModeling;

/**
 * The `Circle` class with radius attribute. 
 * You can access and modify this attribute. 
 * Calculate the area and circumference of the circle.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 13, 2023
 */

public class Circle {
    private double radius;
    
    private Circle() {};
    
    // Private Builder constructor
    private Circle(Builder builder) { 
        this.radius = builder.radius;
    }
    
    // Getter
    public double getRadius() {
        return radius;
    }
    
    // Setter
    public void setRadius(double r) {
        // Check for any conditions if needed, for example, radius should be non-negative.
        if (r < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = r;
    }
    
    public static class Builder {
        private double radius;

        public Builder() {
        }

        public Builder radius(double radius) {
            this.radius = radius;
            return this;
        }

        public Circle build() {
            return new Circle(this);
        }
    }
    
    /**
     * Calculates circle's area
     * @return double
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates circle's circumference
     * @return double
     */
    public double calculateCircumference() {
        return Math.PI * 2 * radius;
    }
    
    public static void main(String[] args) {
        // Test data
        Circle circle1 = new Builder().radius(3).build();
        Circle circle2 = new Builder().radius(5).build();

        // Print the results of area and circumference for circle1
        System.out.println("Circle 1 - Area: " + circle1.calculateArea());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        // Print the results of area and circumference for circle2
        System.out.println("Circle 2 - Area: " + circle2.calculateArea());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}

