package service;

import data.entites.Price;
import data.repository.PriceRepository;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }
    public void createPrice(Price price){
        priceRepository.save(price);
    }

    public Price findById(int id){
        return priceRepository.findById(id).get();
    }
}
