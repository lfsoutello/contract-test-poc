package dev.lfsoutello.contracttestpoc.domains.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private Long productId;

    private BigDecimal unitPrice;

    private int quantity;
}
