package dev.lfsoutello.contracttestpoc.product;

import dev.lfsoutello.contracttestpoc.domains.order.OrderDTO;
import dev.lfsoutello.contracttestpoc.domains.order.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDTO> create(@RequestBody CreateOrderForm body) {
        log.info("[ExampleController] m=create, body={}", body);
        return ResponseEntity.ok(
            orderService.create(body.getItems().stream().map(OrderItemForm::toCreateOrderItemInput).toList()));
    }
}
