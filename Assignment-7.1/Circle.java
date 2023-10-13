public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter methods for the radius attribute
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle circle = new Circle(5.0);

        // Calculate and print the area and perimeter of the circle
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}