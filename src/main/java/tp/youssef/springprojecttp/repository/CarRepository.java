package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,String> {
    List<Car> findByCarName(String carName);


}
