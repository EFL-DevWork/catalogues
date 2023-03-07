package com.cart.cartCatalogues.model;

import jakarta.persistence.*;

@Entity
public class Products {

    @Id
    int product_id;
    String product_info;
    String name;
    String image_url;
    Long price;
    @ManyToOne(fetch = FetchType.LAZY)
    Category category;

    public String getProduct_info() {
        return product_info;
    }

    public void setProduct_info(String product_info) {
        this.product_info = product_info;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Products() {
    }

    public Products(int product_id, String product_info, String name, String image_url, Long price, Category category) {
        this.product_id = product_id;
        this.product_info = product_info;
        this.name = name;
        this.image_url = image_url;
        this.price = price;
        this.category = category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }



    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_info='" + product_info + '\'' +
                ", name='" + name + '\'' +
                ", image_url='" + image_url + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
