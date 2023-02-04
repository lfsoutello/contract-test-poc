package dev.lfsoutello.contracttestpoc.order;

import dev.lfsoutello.contracttestpoc.domains.order.CreateOrderItemInput;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class OrderItemForm {
    private final Long productId;

    private final int quantity;

    public CreateOrderItemInput toCreateOrderItemInput() {
        return new CreateOrderItemInput(productId, quantity);
    }
}
