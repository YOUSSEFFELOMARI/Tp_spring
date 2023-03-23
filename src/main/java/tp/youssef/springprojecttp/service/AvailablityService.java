package tp.youssef.springprojecttp.service;

import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;

import java.time.LocalDateTime;

@Service
public interface AvailablityService {
    public boolean checkCarAvailablity(Car car, LocalDateTime start, LocalDateTime end);
}
