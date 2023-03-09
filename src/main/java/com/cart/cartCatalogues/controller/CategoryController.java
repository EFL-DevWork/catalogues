package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.exception.ResourceNotFoundException;
import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.CategoryNameId;
import com.cart.cartCatalogues.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<Category> insertCategories(Category category) {
        Category newCategory = categoryService.insertCategories(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);

    }

    @GetMapping("/get")
    public ResponseEntity<CategoryNameId> getCategories() {
        CategoryNameId category = categoryService.getCategoriesNameAndID();
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping("get/{catId}")
    public ResponseEntity<Optional<Category>> getById(@PathVariable("catId") long catId) {
        Optional<Category> getById = categoryService.getCategoriesByID(catId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + catId);
        }
        return new ResponseEntity<>(getById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{catId}")
    public void deleteById(@PathVariable("catId") long catId) {
        Optional<Category> getById = categoryService.getCategoriesByID(catId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + catId);
        }
        categoryService.deleteCategoryById(catId);
    }

}
