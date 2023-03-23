package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Availablity extends BaseEntity{
    @Id
    @UuidGenerator
    private String availablityId;
    private LocalDateTime holidayStartDate;
    private LocalDateTime holidayEndDate;
    private List<Days> weekReposDay;
}
