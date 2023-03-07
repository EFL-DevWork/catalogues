package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<Category> insertCategories(Category category)
    {
        Category newCategory=categoryService.insertCategories(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);

    }

}
