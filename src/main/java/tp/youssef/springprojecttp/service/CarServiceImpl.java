package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;
}
