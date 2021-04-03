package domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = {"type"})
public class FuelDispenser {

    List<Car> cars = new ArrayList<Car>();
    private double gasolinePrice;


}

