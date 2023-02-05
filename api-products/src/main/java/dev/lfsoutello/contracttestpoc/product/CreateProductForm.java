package dev.lfsoutello.contracttestpoc.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CreateProductForm {
    private String name;

    private String price;
}
