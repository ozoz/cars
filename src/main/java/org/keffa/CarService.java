package org.keffa;

import org.springframework.stereotype.Service;

@Service
public class CarService {

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
}
