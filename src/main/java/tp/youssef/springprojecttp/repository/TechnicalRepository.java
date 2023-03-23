package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.TechnicalVisit;
@Repository
public interface TechnicalRepository extends JpaRepository<TechnicalVisit, String> {
}
