package tp.youssef.springprojecttp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Data
@Entity
public class GrisCard extends BaseEntity{
    @Id
    @UuidGenerator
    private String grisCardId;

    private LocalDateTime activationDate;
    private LocalDateTime endDate;
}
