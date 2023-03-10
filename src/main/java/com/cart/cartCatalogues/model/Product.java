package com.cart.cartCatalogues.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int product_id;
    String product_info;
    String name;
    String image_url;
    Long price;
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;

    public Product() {
    }
}
