package simplifyingconditionalexpressions.introducenullobject;

public class Customer {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Customer(Address address) {
        this.address = address == null ? new NullAddress() : address;
    }
}
