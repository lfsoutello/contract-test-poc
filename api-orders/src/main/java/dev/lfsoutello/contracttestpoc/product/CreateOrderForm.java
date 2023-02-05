package dev.lfsoutello.contracttestpoc.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class CreateOrderForm {
    private List<OrderItemForm> items;
}
