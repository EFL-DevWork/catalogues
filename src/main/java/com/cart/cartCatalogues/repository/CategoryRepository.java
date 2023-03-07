package com.cart.cartCatalogues.repository;

import com.cart.cartCatalogues.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    String FIND_CATEGORY = "Select category_id,name from Category";
    @Query(value = FIND_CATEGORY, nativeQuery = true)
    public List<Object[]> getcategoryNameId();


}