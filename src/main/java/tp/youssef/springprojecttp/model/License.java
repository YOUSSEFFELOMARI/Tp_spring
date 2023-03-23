package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class License extends BaseEntity{

    @Id
    @UuidGenerator
    private String licenseId;

    @Enumerated(EnumType.STRING)
    private Type LicenseType;
    public enum Type{ A, B, C, D}

}
