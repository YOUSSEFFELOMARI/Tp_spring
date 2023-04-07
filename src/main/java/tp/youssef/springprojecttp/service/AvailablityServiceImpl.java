package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.model.Driver;
import tp.youssef.springprojecttp.model.Trip;
import tp.youssef.springprojecttp.repository.CarRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AvailablityServiceImpl implements AvailablityService{

    @Autowired
    CarRepository carRepository;

    TripService tripService;
    @Override
    public boolean checkCarAvailablity(Car car, LocalDateTime start,LocalDateTime end) {
        List<Trip> tripsInProgress =  this.tripService.getAllInProgressTrips().stream().filter(e->e.getCar().getCarId().equals(car.getCarId())).toList();
        //merging the trips above
        for (Trip trip :  tripsInProgress) {
            if (trip.getStartDate().isBefore(end) && trip.getEndDate().isAfter(start)) {
                return false;
            }
        }
        return true;

    }

    public boolean checkDriverAvailablity(Driver driver, LocalDateTime start, LocalDateTime end) {
        Driver driver1= tripService.getDriver(driver.getDriverId());

        return (driver.getRepo().getHolidayStartDate().isBefore(LocalDateTime.now()) &&
                driver.getRepo().getHolidayEndDate().isAfter(LocalDateTime.now()) ) || driver1 != null;
    }

}
