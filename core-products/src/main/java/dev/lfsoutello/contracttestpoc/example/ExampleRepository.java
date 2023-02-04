package dev.lfsoutello.contracttestpoc.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
}
