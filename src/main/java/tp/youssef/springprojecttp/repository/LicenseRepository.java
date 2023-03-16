package tp.youssef.springprojecttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.youssef.springprojecttp.model.License;
@Repository
public interface LicenseRepository extends JpaRepository<License, Integer> {
}
