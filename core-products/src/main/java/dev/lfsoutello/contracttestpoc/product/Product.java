package dev.lfsoutello.contracttestpoc.product;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class Product {
   @Id
   @GeneratedValue
   private Long id;
   private String name;

   private BigDecimal price;
}
