package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    public CarDaoImpl () {
        cars = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
