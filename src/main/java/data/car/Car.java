package data.car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<CarParts> listOfCarParts;

    public Car() {
        listOfCarParts = new ArrayList<>();
    }

    public List<CarParts> getCarParts() {
        return listOfCarParts;
    }

    public void setCarParts(CarParts carParts) {
        listOfCarParts.add(carParts);
    }
}
