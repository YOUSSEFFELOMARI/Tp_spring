package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.model.Driver;
import tp.youssef.springprojecttp.model.Trip;
import tp.youssef.springprojecttp.repository.DriverRepository;
import tp.youssef.springprojecttp.repository.TripReposity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private TripReposity tripReposity;

    @Autowired
    private TripService tripService;


    Optional<Driver> getDriver(String driverId){
        return this.driverRepository.findById(driverId);
    }
}
