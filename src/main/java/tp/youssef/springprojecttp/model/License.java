package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class License extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int licenseId;

    @Enumerated(EnumType.STRING)
    private Type LicenseType;
    public enum Type{ A, B, C, D}

}
