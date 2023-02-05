package dev.lfsoutello.contracttestpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OrderApi {

	public static void main(String[] args) {
		SpringApplication.run(OrderApi.class, args);
	}
}
