package dev.lfsoutello.contracttestpoc.product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody CreateProductForm body) {
        log.info("[ExampleController] m=create, body={}", body);
        BigDecimal price = new BigDecimal(body.getPrice());
        return ResponseEntity.ok(productService.create(body.getName(), price));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> read(@PathVariable Long id) {
        log.info("[ExampleController] m=read, id={}", id);
        return ResponseEntity.ok(productService.read(id));
    }
}
