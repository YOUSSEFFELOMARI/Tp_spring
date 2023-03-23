package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class TechnicalVisit extends BaseEntity{
    @Id
    @UuidGenerator
    private String technicalVisitId;

    private String visitorCenter;


}
