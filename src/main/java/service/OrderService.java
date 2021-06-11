package service;

import data.entites.Order;
import data.entites.RemainsGas;
import data.repository.OrderRepository;
import data.repository.RemainsGasRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private RemainsGasRepository remainsGasRepository;

    public OrderService(OrderRepository orderRepository, RemainsGasRepository remainsGasRepository) {
        this.orderRepository = orderRepository;
        this.remainsGasRepository = remainsGasRepository;
    }

    public void createOrder(Order order){
        orderRepository.save(order);
        RemainsGas remainsGas = remainsGasRepository.findByGasolineType(order.getPrice().getGasolineType());
        remainsGas.setAmountGas(remainsGas.getAmountGas()-order.getCar().getAmountOfGasoline());
        remainsGasRepository.save(remainsGas);
    }
    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public List<Order> findByDate(Date createDate){
        return orderRepository.findByCreateDate(createDate);
    }
}
