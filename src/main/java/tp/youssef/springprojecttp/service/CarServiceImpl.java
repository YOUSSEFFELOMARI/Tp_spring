package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.repository.CarRepository;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> availableCars() {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
       return this.carRepository.findAll();
    }

    @Override
    public Optional<Car> getCar(String carId){
       return this.carRepository.findById(carId);
    }

}
