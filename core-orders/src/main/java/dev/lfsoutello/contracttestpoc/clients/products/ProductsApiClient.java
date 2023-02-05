package dev.lfsoutello.contracttestpoc.clients.products;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "products-api", url = "http://localhost:8081")
public interface ProductsApiClient {

    @GetMapping(value = "/product/{id}")
    Product getProductById(@PathVariable Long id);
}
