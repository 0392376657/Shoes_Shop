package ctd.shoesfix.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "brand", schema = "shoes")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long id;
    // Adidas, Nike
    @Column(name = "brand_name",unique = true)
    private String name;
    // Describe about the brand
    @Column(name = "description")
    private String description;
    @Column(name = "images")
    private String images;
    // status of sale (trạng thái còn bán ở shop hay không?)
    @Column(name = "status")
    private boolean status;
    @Column(name = "created_at")
    private LocalDate createdAt;
}
