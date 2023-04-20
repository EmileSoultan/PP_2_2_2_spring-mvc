package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping
    public String getCarsList(Model model, @RequestParam(value = "count", defaultValue = "5") int count){
        model.addAttribute("cars", carService.showCars(count));
        return "cars";

    }
}