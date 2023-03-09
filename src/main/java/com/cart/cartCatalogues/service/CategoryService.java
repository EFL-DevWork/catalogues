package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.CategoryNameId;
import com.cart.cartCatalogues.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category insertCategories(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public CategoryNameId getCategoriesNameAndID() {
        return categoryRepository.getCategoryNameId();
    }

    public Optional<Category> getCategoriesByID(long id)
    {
        return categoryRepository.findById(id);
    }

    public void deleteCategoryById(long id) {
        categoryRepository.deleteById(id);
    }

}
