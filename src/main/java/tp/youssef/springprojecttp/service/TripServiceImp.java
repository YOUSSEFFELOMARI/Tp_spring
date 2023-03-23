package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import tp.youssef.springprojecttp.model.Trip;
import tp.youssef.springprojecttp.model.TripStatus;
import tp.youssef.springprojecttp.repository.TripReposity;

import java.util.List;

public class TripServiceImp implements TripService{
  @Autowired
    private TripReposity tripReposity;

    public List<Trip> getAllTrips(){
    return this.tripReposity.findAll();
    }

    public List<Trip> getAllCompleteTrips(){
     return this.getAllTrips().stream().filter(e->e.getIsDone().toString().equals(TripStatus.COMPLETE.toString())).toList();
    }

    public List<Trip> getAllInProgressTrips(){
      return this.getAllTrips().stream().filter(e->e.getIsDone().toString().equals(TripStatus.IN_PROGRESS.toString())).toList();
    }

    public List<Trip> getAllLaterTrips(){
      return this.getAllTrips().stream().filter(e->e.getIsDone().toString().equals(TripStatus.LATER.toString())).toList();
    }
}
