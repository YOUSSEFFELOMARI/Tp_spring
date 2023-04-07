package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDateTime;
@Data
@Entity
public class Trip extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tripId;
    private String start;//location
    private String end;//location
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Enumerated(EnumType.STRING)
    private TripStatus isDone = TripStatus.COMPLETED;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Driver.class)
    @JoinColumn(name = "driver_id")
    private Driver driver;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Car.class)
    @JoinColumn(name = "car_id")
    private Car car;


}
