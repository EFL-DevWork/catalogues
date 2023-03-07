package com.cart.cartCatalogues.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Category {

    @Id
    int id;
    String name;
    String slug;
    String description;

    public Category() {
    }

    public Category(int id, String name, String slug, String description, List<Products> products) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }

    public int getCategory_id() {
        return id;
    }

    public void setCategory_id(int category_id) {
        this.id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
