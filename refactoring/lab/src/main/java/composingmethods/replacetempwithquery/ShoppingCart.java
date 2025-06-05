package composingmethods.replacetempwithquery;

import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

