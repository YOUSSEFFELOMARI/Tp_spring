package tp.youssef.springprojecttp.service;

import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;

@Service
public interface AvailablityService {
    public boolean checkCarAvailablity(Car car);
}
