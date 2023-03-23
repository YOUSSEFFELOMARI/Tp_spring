package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Data
@Entity
public class Trip extends BaseEntity{
    @Id
    @UuidGenerator
    private String tripId;
    private String start;
    private String end;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Driver.class)
    @JoinColumn(name = "driver_id")
    private Driver driver;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Car.class)
    @JoinColumn(name = "car_id")
    private Car car;
}
