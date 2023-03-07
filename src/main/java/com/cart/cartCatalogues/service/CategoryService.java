package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category insertCategories(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public List<Object[]> getCategoriesNameAndID()
    {
        return categoryRepository.getcategoryNameId();
    }

    public Optional<Category> getCategoriesByID(int id)
    {
        return categoryRepository.findById(id);
    }

    public String deleteCategoryById(int id)
    {
        categoryRepository.deleteById(id);
        return "Category Delete Successfully";
    }


}
