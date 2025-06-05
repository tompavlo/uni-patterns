package organizingdata.valuetoreference;

public class Product {
    private String name;
    private double price;
    private Currency currency;
    public Product(String name, double price, String currencyCode, Currency currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCurrencyCode() {
        return currency.getCode();
    }
    // Інші методи класу...
}

