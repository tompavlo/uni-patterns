package simplifyingconditionalexpressions.replacenestedconditionalwithguardclauses;

public class Test {
    public void processOrder(int quantity, double price) {
        if (price > 0) {
            System.out.println("Invalid price");
            return;
        }
        if (lessThenZeroValidation(quantity)) {
            System.out.println("Invalid quantity");
            return;
        }


    }

    private boolean lessThenZeroValidation(int price) {
        return price < 0;
    }

}
