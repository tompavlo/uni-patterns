package simplifyingconditionalexpressions.introducenullobject;

public class Address {
    private String street;
    private String city;

    public String getStreet() {
        return street == null? "No city" : street;
    }

    public String getCity() {
        return city == null? "No city" : city;
    }

    public boolean isNull(){
        return false;
    }
}

