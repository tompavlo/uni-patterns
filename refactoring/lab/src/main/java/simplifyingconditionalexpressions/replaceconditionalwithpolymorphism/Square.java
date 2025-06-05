package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;

public class Square implements Shape {
    double length;

    @Override
    public double calculateArea() {
        return length * length;
    }
}
