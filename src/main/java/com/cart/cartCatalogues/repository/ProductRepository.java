package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    String FIND_ALL_PRODUCTS = "Select * from product where category_id=?";

    @Query(value = FIND_ALL_PRODUCTS, nativeQuery = true)
    List<Product> getAllProductsByCategoryId(int category_id);

}
