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
public class CarSticker extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String carStickerId;

    private LocalDateTime carStickerDate;
}
