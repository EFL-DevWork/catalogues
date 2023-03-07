package com.cart.cartCatalogues.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {

    @Id
    Long category_id;
    String name;
    String slug;
    String description;
    @OneToMany(mappedBy = "category")
    List<Products> products;

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public Category() {
    }

    public Category(Long category_id, String name, String slug, String description, List<Products> products) {
        this.category_id = category_id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.products = products;
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
                "category_id=" + category_id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", products=" + products +
                '}';
    }

}
