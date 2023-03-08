package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
