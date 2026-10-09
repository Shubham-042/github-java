package oopsExercises.Ques24;
// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize Rectangle attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implement calculatePerimeter() for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getter methods for length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

// Circle class extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize Circle attributes
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea() for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement calculatePerimeter() for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Create an instance of Circle
        Circle circle = new Circle(7);
        System.out.println("\nCircle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
