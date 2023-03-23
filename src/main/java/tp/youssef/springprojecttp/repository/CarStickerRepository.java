package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.CarSticker;

@Repository
public interface CarStickerRepository extends JpaRepository<CarSticker,String> {
}
