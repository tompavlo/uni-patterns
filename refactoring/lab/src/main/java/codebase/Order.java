package codebase;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double totalPrice;

    public Order(String customerName, List<String> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }


    //потрібно розбити цей метод на підметоди
    public void processOrder() {
        // Багато коду для обробки замовлення
        // Цей метод став дуже довгим і складним для розуміння
    }
    private double calculateTotalPrice() {
        double price = 0.0;
        for (String item : items) {
            // Логіка для розрахунку ціни кожного товару
            // Додати до загальної ціни
        }
        return price;
    }

    public int getItemCount() {
        return 1;
    }

    public void setStatus(String processed) {

    }

}