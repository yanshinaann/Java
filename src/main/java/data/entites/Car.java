package data.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Integer amountOfGasoline;
    @OneToOne(mappedBy = "car")
    private Order order;



}
