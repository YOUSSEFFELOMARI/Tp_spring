package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Availablity extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int availablityId;
    private LocalDateTime holidayStartDate;
    private LocalDateTime holidayEndDate;
    private LocalDateTime weekReposDay;
}
