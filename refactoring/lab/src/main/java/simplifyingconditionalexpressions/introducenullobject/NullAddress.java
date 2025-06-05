package simplifyingconditionalexpressions.introducenullobject;

public class NullAddress extends Address {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getStreet() {
        return "No Street";
    }

    @Override
    public String getCity() {
        return "No City";
    }
}
