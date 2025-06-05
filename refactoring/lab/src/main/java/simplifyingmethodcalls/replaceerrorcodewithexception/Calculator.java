package simplifyingmethodcalls.replaceerrorcodewithexception;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divided by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Результат ділення: " + result);

    }

}
