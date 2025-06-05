package organizingdata.duplicateobserveddata;

import java.util.Observable;

public class OrderManager extends Observable {
    private String customerName;
    private String productName;
    private int quantity;

    public OrderManager(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        super.setChanged();
        super.notifyObservers();
     }

    public void setProductName(String productName) {
        this.productName = productName;
        super.setChanged();
        super.notifyObservers();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        super.setChanged();
        super.notifyObservers();
    }
}
