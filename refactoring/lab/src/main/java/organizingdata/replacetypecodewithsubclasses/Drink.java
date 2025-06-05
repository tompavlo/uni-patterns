package organizingdata.replacetypecodewithsubclasses;

public class Drink extends Product{
    public Drink(int typeCode, String name) {
        super(typeCode, name);
    }

    @Override
    public void process() {
        //some logic
    }
}
