package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}