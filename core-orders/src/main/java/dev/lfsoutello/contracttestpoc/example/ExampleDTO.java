package dev.lfsoutello.contracttestpoc.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExampleDTO {
    private final Long id;
    private final String text;

    public ExampleDTO(Order order) {
        id = order.getId();
        text = order.getText();
    }
}
