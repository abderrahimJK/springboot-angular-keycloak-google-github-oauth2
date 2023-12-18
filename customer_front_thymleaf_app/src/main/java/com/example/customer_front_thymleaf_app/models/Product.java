package com.example.customer_front_thymleaf_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
