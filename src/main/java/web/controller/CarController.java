package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

import static web.model.Car.createCarsList;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCarsList(@RequestParam (value = "count", defaultValue = "5") Integer count, Model model) {
        CarService carService = new CarServiceImp();
        List<Car> carsList = carService.getCarsFromList(createCarsList(), count);
        model.addAttribute("cars", carsList);
        return "/cars";
    }
}
