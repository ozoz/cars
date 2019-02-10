package org.keffa.controller;

import org.keffa.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/{id}")
    @ResponseBody
    public Car getCar(@PathVariable("id") Integer id) {
        return CarMapper.convertCarModelToApi(carService.getCarName(id));
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Car createCar(@RequestBody Car car) {
        return CarMapper.convertCarModelToApi(carService.createCar(CarMapper.convertCarApiToModel(car)));
    }

    @GetMapping("/toto")
    public String getCar() {
        return "<html><body><b>toto</b></body></html>";
    }

}
