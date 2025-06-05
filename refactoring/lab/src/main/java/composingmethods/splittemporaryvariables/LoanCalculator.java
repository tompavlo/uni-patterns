package composingmethods.splittemporaryvariables;

public class LoanCalculator {
    public double calculateLoanInterest(double loanAmount, double annualInterestRate,
                                        int loanTermYears) {

        final double interestRate = annualInterestRate / 100;
        double totalInterest = 0;
        final int totalMonth = 12;
        double monthlyInterest = interestRate / totalMonth;
        double totalPayments = loanTermYears * totalMonth;
        for (int i = 0; i < totalPayments; i++) {
            totalInterest += loanAmount * monthlyInterest;
        }

        return totalInterest;
    }
    // Інші методи класу...
}

