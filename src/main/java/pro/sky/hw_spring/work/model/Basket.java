package pro.sky.hw_spring.work.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> orders = new ArrayList<>();


    public List<Integer> add(List<Integer> ids) {
        orders.addAll(ids);
        return orders;
    }

    public List<Integer> get() {
        return orders;
    }
}
