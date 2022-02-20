package com.example.sr_c1_e1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

  @Id private int id;

  private String name;
}
