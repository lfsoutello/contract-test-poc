package dev.lfsoutello.contracttestpoc.product;

import dev.lfsoutello.contracttestpoc.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDTO create(String name, BigDecimal price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        return new ProductDTO(productRepository.save(product));
    }

    public ProductDTO read(Long id) {
        Product product = productRepository.findById(id)
            .orElseThrow(ProductNotFoundException::new);
        return new ProductDTO(product);
    }
}
