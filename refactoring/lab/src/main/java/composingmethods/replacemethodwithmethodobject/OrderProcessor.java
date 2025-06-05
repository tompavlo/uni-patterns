package composingmethods.replacemethodwithmethodobject;

import composingmethods.replacetempwithquery.Item;

public class OrderProcessor {

    public void processOrder(Order order) {
        double totalCost = 0;
        int itemCount = order.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            totalCost += order.getItem(i).getTotalPrice();
        }
        Customer customer = order.getCustomer();
        if (customer.isVIP()) {
            totalCost -= totalCost * 0.1;
        }
        order.setTotalCost(totalCost);
        order.setStatus("Processed");
    }
}

