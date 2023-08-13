package pro.sky.hw_spring.work.service;


import org.springframework.stereotype.Service;
import pro.sky.hw_spring.work.model.Basket;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> add(List<Integer> ids) {

        return basket.add(ids);
    }

    public List<Integer> get() {
        return basket.get();
    }
}
