package dev.lfsoutello.contracttestpoc.domains.order;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class OrderItemDTO {

    private final Long id;

    private final Long productId;

    private final BigDecimal unitPrice;

    private final int quantity;

    public OrderItemDTO(OrderItem orderItem) {
        id = orderItem.getId();
        productId = orderItem.getProductId();
        unitPrice = orderItem.getUnitPrice();
        quantity = orderItem.getQuantity();
    }
}
