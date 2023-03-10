import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product when product id is valid"
    request {
        method GET()
        url("/product/1")
    }
    response {
        body(
            id: 1,
            name: "Product 1",
            price: 100.0
        )
        status 200
        headers {
            contentType("application/json")
        }
    }
}
