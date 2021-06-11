package data.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Price {
    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private GasolineType gasolineType;

    private double price;

    private double wholesalePrice;

    @OneToMany(mappedBy="order")
    private Set<Order> orders;

}
