package dev.lfsoutello.contracttestpoc.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.LOCAL,
    ids = "dev.lfsoutello:api-products:+:stubs:8081")
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        OrderItemForm orderItemForm = new OrderItemForm();
        orderItemForm.setProductId(1L);
        orderItemForm.setQuantity(1);
        CreateOrderForm createOrderForm = new CreateOrderForm();
        createOrderForm.setItems(List.of(orderItemForm));
        ObjectMapper mapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders.post("/order")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(createOrderForm)))
            .andExpect(status().isOk())
            .andExpect(content().json(mapper.writeValueAsString(createOrderForm)));
    }
}
