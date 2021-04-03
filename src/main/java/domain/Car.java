package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Car {

    private String name;
    private Integer amountOfGasoline;
    private GasolineType gasolineType;


}
