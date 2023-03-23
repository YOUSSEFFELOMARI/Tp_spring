package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Driver;
import tp.youssef.springprojecttp.repository.DriverRepository;

import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverRepository driverRepository;

    Optional<Driver> getDriver(String driverId){
       return this.driverRepository.findById(driverId);
    }
}
