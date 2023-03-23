package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.youssef.springprojecttp.model.Trip;

public interface TripReposity extends JpaRepository<Trip,String> {
}
