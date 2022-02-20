package com.example.sr_c1_e1.service;

import com.example.sr_c1_e1.model.Product;
import com.example.sr_c1_e1.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public Flux<Product> getProducts() {
    return productRepository.findAll().delayElements(Duration.ofSeconds(5));
  }
}
