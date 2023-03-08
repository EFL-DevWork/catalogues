package com.cart.cartCatalogues.model;

import jakarta.persistence.Id;

public class CategoryNameId {
    @Id
    Long category_id;
    String name;

    public CategoryNameId(Long category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    public CategoryNameId() {
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryNameId{" +
                "category_id=" + category_id +
                ", name='" + name + '\'' +
                '}';
    }
}
