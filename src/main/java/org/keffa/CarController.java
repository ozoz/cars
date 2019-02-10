package org.keffa;

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
        return carService.getCarName(id);
    }

    @GetMapping("/toto")
    public String getCar() {
        return "<html><body><b>toto</b></body></html>";
    }

}
