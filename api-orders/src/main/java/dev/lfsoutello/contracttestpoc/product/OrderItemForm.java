package dev.lfsoutello.contracttestpoc.product;

import dev.lfsoutello.contracttestpoc.domains.order.CreateOrderItemInput;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderItemForm {
    private Long productId;

    private int quantity;

    public CreateOrderItemInput toCreateOrderItemInput() {
        return new CreateOrderItemInput(productId, quantity);
    }
}
