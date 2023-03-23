package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Driver extends BaseEntity{
    @Id
    @UuidGenerator
    private String driverId;
    private String name;
    private String lastName;
    private String CIN;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL, targetEntity = Availablity.class)
    @JoinColumn(name = "availablity_id")
    private Availablity availablity;
    private int experience;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,targetEntity = License.class)
    @JoinColumn(name = "licence_id")
    private Set<License> licenceSet=new HashSet<>();
    private LocalDateTime licenceDeliveryDate;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Profile.class)
    @JoinColumn(name = "prfile_id")
    private Profile profile;


}
