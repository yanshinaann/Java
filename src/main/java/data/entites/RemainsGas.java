package data.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RemainsGas {
    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private GasolineType gasolineType;

    private double amountGas;



}
