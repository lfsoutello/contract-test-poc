package dev.lfsoutello.contracttestpoc.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class ProductDTO {
    private final Long id;
    private final String name;

    private final BigDecimal price;

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
    }
}
