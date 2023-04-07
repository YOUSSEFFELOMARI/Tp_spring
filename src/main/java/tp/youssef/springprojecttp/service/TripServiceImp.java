package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.model.Driver;
import tp.youssef.springprojecttp.model.Trip;
import tp.youssef.springprojecttp.model.TripStatus;
import tp.youssef.springprojecttp.repository.TripReposity;

import java.util.List;
@Service
public class TripServiceImp implements TripService{
    @Autowired
    private TripReposity tripReposity;

    public List<Trip> getAllTrips(){
    return this.tripReposity.findAll();
    }

    public List<Trip> getAllCompleteTrips(){
        return this.getAllTrips().stream().filter(e->e.getIsDone().toString().equals(TripStatus.COMPLETED.toString())).toList();
    }

    public List<Trip> getAllInProgressTrips(){
        return this.getAllTrips().stream().filter(e->e.getIsDone().toString().equals(TripStatus.IN_PROGRESS.toString())).toList();
    }

    public Driver getDriver(String id){
        return tripReposity.getTripByDriverDriverId(id).getDriver();
    }



}
