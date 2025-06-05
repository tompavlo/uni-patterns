package simplifyingconditionalexpressions.introduceassertion;

public class Test {
    public double calculateAverage(int[] numbers) {
        assert numbers != null && numbers.length > 0 : "Incorrect array";
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
