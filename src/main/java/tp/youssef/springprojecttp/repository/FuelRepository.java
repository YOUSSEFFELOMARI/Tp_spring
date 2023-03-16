package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.Fuel;
@Repository
public interface FuelRepository extends JpaRepository<Fuel, Integer> {
}
