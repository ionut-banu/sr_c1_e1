package com.example.sr_c1_e1.controller;

import com.example.sr_c1_e1.model.Product;
import com.example.sr_c1_e1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

@RestController
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

  @GetMapping(value = "/product", produces = TEXT_EVENT_STREAM_VALUE)
  public Flux<Product> getProducts() {
    return productService.getProducts();
  }
}
