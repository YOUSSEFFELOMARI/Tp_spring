package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.GrisCard;
@Repository
public interface GrisCardRepository extends JpaRepository<GrisCard,Integer> {
}
