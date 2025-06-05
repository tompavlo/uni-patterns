package composingmethods.exctractvariable;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void printCircleDetails() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

}
