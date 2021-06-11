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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GasolineType getGasolineType() {
        return gasolineType;
    }

    public void setGasolineType(GasolineType gasolineType) {
        this.gasolineType = gasolineType;
    }

    public double getAmountGas() {
        return amountGas;
    }

    public void setAmountGas(double amountGas) {
        this.amountGas = amountGas;
    }
}
