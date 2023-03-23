package tp.youssef.springprojecttp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class Fuel extends BaseEntity{

    @Id
    @UuidGenerator
    private String fuelId;
    private double currentFuel;
    private double addedFuel;
    private double addedFuelPrice;
}
