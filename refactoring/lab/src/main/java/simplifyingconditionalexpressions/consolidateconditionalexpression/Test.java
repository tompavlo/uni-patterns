package simplifyingconditionalexpressions.consolidateconditionalexpression;

public class Test {
    public void processPayment(double amount, boolean isMember, boolean
            isDiscountAvailable) {
        if (checkIfPossibleDiscountForMember(amount, isMember)) {
            applyDiscount();
        }
        if (checkIfPossibleDiscountForBigAmount(amount, isDiscountAvailable)) {
            applyDiscount();
        }
    }

    public void applyDiscount() {
    }

    public boolean checkIfPossibleDiscountForMember(double amount, boolean isMember) {
        return amount > 100 && isMember;
    }

    public boolean checkIfPossibleDiscountForBigAmount(double amount, boolean isDiscountAvailable) {
        return amount > 200 && isDiscountAvailable;
    }
}
