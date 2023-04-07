package tp.youssef.springprojecttp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.repository.CarRepository;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin("*")
public class CarController {
    @Autowired
    CarRepository carRepository;

    @GetMapping("/getCarByName")
    public List<Car> getCarByName(@RequestParam(name = "")  String carName){
        return carRepository.findByCarName(carName);
    }


    @PostMapping("/saveCar")
    @ResponseBody
    public ResponseEntity<String> saveCar(@RequestBody Car car){
        System.out.println("ha");
        carRepository.save(car);

        return ResponseEntity.ok("car saved");
    }



}
