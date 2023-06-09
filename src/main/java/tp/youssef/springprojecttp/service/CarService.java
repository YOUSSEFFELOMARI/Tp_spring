package tp.youssef.springprojecttp.service;

import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;

import java.util.List;

@Service
public interface CarService {

    public List<Car> availableCars();

}
