package com.example.sr_c1_e1.repository;

import com.example.sr_c1_e1.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {}
