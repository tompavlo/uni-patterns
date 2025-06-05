package composingmethods.replacemethodwithmethodobject;

public class Customer {
    private boolean isVIP;

    public boolean isVIP() {
        return isVIP;
    }

    public Customer(boolean isVip){
        this.isVIP = isVip;
    }
}
