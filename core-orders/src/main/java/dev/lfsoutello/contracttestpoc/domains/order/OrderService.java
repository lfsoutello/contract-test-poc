package dev.lfsoutello.contracttestpoc.domains.order;

import dev.lfsoutello.contracttestpoc.exception.ExampleNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderDTO create(List<CreateOrderItemInput> items) {
        //TODO
        return null;
    }
}
