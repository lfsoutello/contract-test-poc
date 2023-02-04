package dev.lfsoutello.contracttestpoc.domains.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Order {
   @Id
   @Getter
   @Setter
   @GeneratedValue
   private Long id;

   @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<OrderItem> items = new ArrayList<>();

   public void addItem(OrderItem item) {
      items.add(item);
   }

   public void removeItem(OrderItem item) {
      items.remove(item);
   }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}
