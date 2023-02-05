package dev.lfsoutello.contracttestpoc.domains.order;

import dev.lfsoutello.contracttestpoc.clients.products.Product;
import dev.lfsoutello.contracttestpoc.clients.products.ProductsApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductsApiClient productsApiClient;

    private final OrderRepository orderRepository;

    public OrderDTO create(List<CreateOrderItemInput> inputItems) {
        Order order = new Order();
        inputItems.forEach(inputItem -> {
            Product product = productsApiClient.getProductById(inputItem.getProductId());
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(product.getId());
            orderItem.setUnitPrice(product.getPrice());
            orderItem.setQuantity(inputItem.getQuantity());
            order.addItem(orderItem);
        });
        return new OrderDTO(orderRepository.save(order));
    }
}
