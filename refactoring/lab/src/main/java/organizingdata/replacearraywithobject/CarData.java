package organizingdata.replacearraywithobject;

import java.util.ArrayList;

public class CarData {
    private ArrayList<Car> cars;
    public CarData(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public CarData(){
        this.cars = new ArrayList<Car>();
    }

    // Додаткові методи для роботи з масивом...
}