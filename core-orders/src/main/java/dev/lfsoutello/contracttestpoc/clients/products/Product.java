package dev.lfsoutello.contracttestpoc.clients.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Product {

    private Long id;

    private String name;

    private BigDecimal price;
}
