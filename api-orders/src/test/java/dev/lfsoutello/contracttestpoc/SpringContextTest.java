package dev.lfsoutello.contracttestpoc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = OrderApi.class)
class SpringContextTest {

    @Test
    void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
