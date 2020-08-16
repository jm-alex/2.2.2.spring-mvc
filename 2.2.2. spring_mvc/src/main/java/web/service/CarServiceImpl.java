package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService, CarDao {
    private CarDao carDao;

    public CarServiceImpl () {
        carDao = new CarDaoImpl();
    }
    @Override
    public void addCar(Car car) {
       carDao.addCar(car);
    }
    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    public void addCarsToTable () {
        Car bmw = new Car("BMW","X3",2010);
        Car tesla = new Car("Tesla","Y",2015);
        Car audi = new Car("AUDI","Q5", 2017);
        addCar(bmw);
        addCar(tesla);
        addCar(audi);
        }

}
