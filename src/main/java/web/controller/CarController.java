package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCarCount(@RequestParam(value = "count", required = false,defaultValue = "5") Integer count, Model model) {
        if (count < 5) {
            model.addAttribute("cars",carService.index(count));
        }else{
            model.addAttribute("cars",carService.index());
        }
        return"car";
    }
}
