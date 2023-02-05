package dev.lfsoutello.contracttestpoc.domains.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateOrderItemInput {
    private final Long productId;

    private final int quantity;
}
