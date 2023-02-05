package dev.lfsoutello.contracttestpoc.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CreateOrderForm {
    private final List<OrderItemForm> items;
}
