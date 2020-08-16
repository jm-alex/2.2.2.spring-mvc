package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "locale", defaultValue = "ru", required = false)
                                    String request) {
        System.out.println("locale: " + request);
        String locale, tableTitle;
        if (request.contains("ru")) {
            locale = "запрос на русском языке";
            tableTitle = "Машины";
        } else if (request.contains("eng")) {
            locale = "request on english";
            tableTitle = "Cars";
        } else {
            locale = " unknown locale";
            tableTitle = "Cars/Машины";
        }
        CarServiceImpl service = new CarServiceImpl();
        service.addCarsToTable();
        List<Car> cars = service.getCars();
        cars.forEach(car -> System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear()));

        model.addAttribute("cars", cars);
        model.addAttribute("locale", locale);
        model.addAttribute("tableTitle", tableTitle);
        return "cars";
    }


}
