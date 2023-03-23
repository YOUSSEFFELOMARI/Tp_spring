package tp.youssef.springprojecttp.service;

import tp.youssef.springprojecttp.model.Trip;

import java.util.List;

public interface TripService {
    List<Trip> getAllTrips();
    List<Trip> getAllCompleteTrips();
    List<Trip> getAllInProgressTrips();
    List<Trip> getAllLaterTrips();
}
