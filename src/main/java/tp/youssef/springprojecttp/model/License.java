package tp.youssef.springprojecttp.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity
public class License extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String licenseId;

    @Enumerated(EnumType.STRING)
    private List<LicenseType> licenseTypes;
    public enum LicenseType{ A, B, C, D}

}
