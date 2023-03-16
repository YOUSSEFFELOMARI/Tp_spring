package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Admin extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int adminId;
    private String name;
    private String lastName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Profile.class)
    @JoinColumn(name = "prfile_id")
    private Profile profile;

}
