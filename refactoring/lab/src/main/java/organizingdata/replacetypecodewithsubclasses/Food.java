package organizingdata.replacetypecodewithsubclasses;

public class Food extends Product{
    public Food(int typeCode, String name) {
        super(typeCode, name);
    }

    @Override
    public void process() {
        //some logic
    }
}
