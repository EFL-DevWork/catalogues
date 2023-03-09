package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    String FIND_ALL_PRODUCTS = "Select * from Products where category_id=?";

    @Query(value = FIND_ALL_PRODUCTS, nativeQuery = true)
    Product getAllProductsByCategoryId(long category_id);

}
