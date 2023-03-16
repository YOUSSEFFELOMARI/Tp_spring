package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.repository.CarRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AvailablityServiceImpl implements AvailablityService{

    @Autowired
    CarRepository carRepository;
    @Override
    public boolean checkCarAvailablity(Car car) {
            boolean available= LocalDateTime.now().isBefore(car.getAvailablity().getHolidayStartDate()) &&
                                LocalDateTime.now().isAfter(car.getAvailablity().getHolidayEndDate()) ;

        return available;
    }


}
