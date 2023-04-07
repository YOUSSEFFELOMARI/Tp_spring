package tp.youssef.springprojecttp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class Profile extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String prfileId;

    private String name;
    private String lastName;
    private String email;
    private String confirmEmail;
    private long phoneNumber;
    private String password;
    private String confirmPassword;

}
