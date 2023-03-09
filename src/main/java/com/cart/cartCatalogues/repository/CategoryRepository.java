package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.CategoryNameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    String FIND_CATEGORY = "Select id,name from Category";

    @Query(value = FIND_CATEGORY, nativeQuery = true)
    CategoryNameId getCategoryNameId();

}