package composingmethods.replacemethodwithmethodobject;

import composingmethods.replacetempwithquery.Item;

public class Order {
    public Item getItem(int i){
        return new Item();
    }

    public void setStatus(String processed) {
    }

    public Customer getCustomer() {
        return new Customer(true);
    }

    public int getItemCount() {
        return 1;
    }

    public void setTotalCost(double totalCost) {

    }
}
