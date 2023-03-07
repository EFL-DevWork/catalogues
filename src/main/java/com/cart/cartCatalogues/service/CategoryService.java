package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category insertCategories(Category category) {
        categoryRepository.save(category);
        return category;
    }

}
