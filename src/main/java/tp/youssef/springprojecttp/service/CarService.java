package tp.youssef.springprojecttp.service;

import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;

import java.util.List;
import java.util.Optional;

@Service
public interface CarService {

    public List<Car> availableCars();
    public List<Car> getAllCars();
    public Optional<Car> getCar(String carId);
}
