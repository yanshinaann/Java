package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor

public class GasStation {
    String name;
    private Map<Car, FuelDispenser> stationMap = new HashMap<Car, FuelDispenser>();
    private Integer tradeMargin;

}
