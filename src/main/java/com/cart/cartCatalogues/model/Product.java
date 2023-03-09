package com.cart.cartCatalogues.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor
public class Product {
    @Getter
    @Id
    long product_id;
    String product_info;
    String name;
    String image_url;
    Long price;
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;

}
