package composingmethods.replacetempwithquery;

public class Item {
    public double getPrice(){
        return 1.0;
    }



    public int getQuantity() {
        return 1;
    }

    public double getTotalPrice(){
        return getPrice() * getQuantity();
    }
}
