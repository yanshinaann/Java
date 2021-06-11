package service;

import data.dto.OrderDto;
import data.entites.Order;
import data.entites.RemainsGas;
import data.repository.CarRepository;
import data.repository.OrderRepository;
import data.repository.PriceRepository;
import data.repository.RemainsGasRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private RemainsGasRepository remainsGasRepository;
    private PriceRepository priceRepository ;
    private CarRepository carRepository;

    public OrderService(OrderRepository orderRepository, RemainsGasRepository remainsGasRepository) {
        this.orderRepository = orderRepository;
        this.remainsGasRepository = remainsGasRepository;
    }

    public void createOrder(OrderDto order){
        Order order1 = new Order();
        order1.setCreateDate(order.getCreateDate());
        order1.setCar(carRepository.findById(order.getCarId()).get());
        order1.setPrice(priceRepository.findById(order.getPriceId()).get());

        orderRepository.save(order1);
        RemainsGas remainsGas = remainsGasRepository.findByGasolineType(order1.getPrice().getGasolineType());
        remainsGas.setAmountGas(remainsGas.getAmountGas()-order1.getCar().getAmountOfGasoline());
        remainsGasRepository.save(remainsGas);
    }
    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public List<Order> findByDate(Date createDate){
        return orderRepository.findByCreateDate(createDate);
    }
}
