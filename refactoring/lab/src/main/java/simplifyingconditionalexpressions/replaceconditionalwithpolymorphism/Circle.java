package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;

public class Circle implements Shape{
    double radius;
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
