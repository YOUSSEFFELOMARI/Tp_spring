package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@Entity
public class CarInsurance extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int carInsuranceId;
    private LocalDateTime activationDate;
    private LocalDateTime endDate;
    @Enumerated(EnumType.STRING)
    private InsuranceType technicalVisit;
    public enum InsuranceType{
        threeMonth, sixMonth, OneYear
    }
}
