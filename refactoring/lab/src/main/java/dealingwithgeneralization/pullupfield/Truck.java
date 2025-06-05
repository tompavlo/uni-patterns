package dealingwithgeneralization.pullupfield;

class Truck extends Vehicle {
    private int loadCapacity;
    public Truck(String color, int loadCapacity, String model) {
        super(color, model);
        this.loadCapacity = loadCapacity;
    }
}
