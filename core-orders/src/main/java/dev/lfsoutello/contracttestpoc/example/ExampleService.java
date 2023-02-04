package dev.lfsoutello.contracttestpoc.example;

import dev.lfsoutello.contracttestpoc.exception.ExampleNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public ExampleDTO create(String text) {
        Order order = new Order();
        order.setText(text);
        return new ExampleDTO(exampleRepository.save(order));
    }

    public ExampleDTO read(Long id) {
        Order order = exampleRepository.findById(id)
            .orElseThrow(ExampleNotFoundException::new);
        return new ExampleDTO(order);
    }

    public ExampleDTO update(Long id, String text) {
        Order order = exampleRepository.findById(id)
            .orElseThrow(ExampleNotFoundException::new);
        order.setText(text);
        return new ExampleDTO(exampleRepository.save(order));
    }

    public void delete(Long id) {
        exampleRepository.deleteById(id);
    }
}
