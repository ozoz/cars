package org.keffa.service;

import org.keffa.model.Car;
import org.keffa.model.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car getCarName(Integer id) {
        String carName;
        if (id.equals(42)) {
            carName = "Xavier Niel";
        } else
            carName = "Toyota";
        Car car = new Car();
        car.setId(id);
        car.setName(carName);
        return car;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

}
