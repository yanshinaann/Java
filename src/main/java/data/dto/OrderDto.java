package data.dto;

import lombok.Data;

import java.util.Date;
@Data
public class OrderDto {

    private Date createDate;
    private int carId;
    private int priceId;


}
