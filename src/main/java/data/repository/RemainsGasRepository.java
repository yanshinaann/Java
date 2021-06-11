package data.repository;

import data.entites.GasolineType;
import data.entites.RemainsGas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainsGasRepository extends CrudRepository<RemainsGas,Integer> {
    RemainsGas findByGasolineType(GasolineType gasolineType);
}
