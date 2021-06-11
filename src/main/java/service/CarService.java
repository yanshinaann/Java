package service;

import data.entites.Car;
import data.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void createCar(Car car){
        carRepository.save(car);
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public List<Car> findByName(String name){
        return carRepository.findCarByName(name);
    }
}
