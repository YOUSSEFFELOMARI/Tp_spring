package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class Car extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String carId;

    private String carName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = GrisCard.class)
    @JoinColumn(name = "grisCard_d")
    private GrisCard grisCard;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = CarInsurance.class)
    @JoinColumn(name = "car_insurance_id")
    private CarInsurance carInsurance;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = CarSticker.class)
    @JoinColumn(name = "car_sticker_id")
    private CarSticker carSticker;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = TechnicalVisit.class)
    @JoinColumn(name = "technical_visit_id")
    private TechnicalVisit technicalVisit;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Fuel.class)
    @JoinColumn(name = "fuel_id")
    private Fuel fuel;
}

