package com.cart.cartCatalogues.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor
public class Category {
    @Getter
    @Id
    Long id;
    String name;
    String slug;
    String description;

}
