package data.repository;

import data.entites.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
    List<Car> findAll();

    List<Car> findCarByName(String name);

}
