package dev.lfsoutello.contracttestpoc.domains.order;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class OrderDTO {
    private final Long id;
    private final List<OrderItemDTO> items;

    public OrderDTO(Order order) {
        id = order.getId();
        items = new ArrayList<>(order.getItems().stream().map(OrderItemDTO::new).toList());
    }
}
