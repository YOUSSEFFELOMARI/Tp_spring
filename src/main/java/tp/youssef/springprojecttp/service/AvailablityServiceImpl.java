package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Car;
import tp.youssef.springprojecttp.model.Trip;
import tp.youssef.springprojecttp.repository.CarRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AvailablityServiceImpl implements AvailablityService{

    @Autowired
    CarRepository carRepository;

    TripService tripService;
    @Override
    public boolean checkCarAvailablity(Car car, LocalDateTime start,LocalDateTime end) {
        List<Trip> tripsInProgress =  this.tripService.getAllInProgressTrips().stream().filter(e->e.getCar().getCarId().equals(car.getCarId())).toList();
        List<Trip> tripsLater=  this.tripService.getAllLaterTrips().stream().filter(e->e.getCar().getCarId().equals(car.getCarId())).toList();

        //merging the trips above
        List<Trip> trips = new ArrayList<>();
        trips.addAll(tripsInProgress);
        trips.addAll(tripsLater);

        for (Trip trip : trips) {
            if (trip.getStartDate().isBefore(end) && trip.getEndDate().isAfter(start)) {
                return false;
            }
        }
        return true;

    }


}
