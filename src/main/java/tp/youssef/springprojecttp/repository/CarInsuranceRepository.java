package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.CarInsurance;
@Repository
public interface CarInsuranceRepository extends JpaRepository<CarInsurance,Integer> {
}
