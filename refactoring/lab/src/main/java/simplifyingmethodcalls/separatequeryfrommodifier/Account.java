package simplifyingmethodcalls.separatequeryfrommodifier;

public class Account {
    private double balance;
    public double getBalance() {
        return balance;
    }

    public void subtrackCommission(){
        double commission = 0.05;
        balance -= balance * commission;
    }
}
