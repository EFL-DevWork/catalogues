package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/get")
    public ResponseEntity<List<Object[]>> getCategories()
    {
        List<Object[]> category=categoryService.getCategoriesNameAndID();
        return new ResponseEntity(category, HttpStatus.OK);
    }

    @GetMapping("get/{catId}")
    public ResponseEntity<Optional<Category>>getByid(@PathVariable("catId") int catId){
        Optional<Category> getbyId = categoryService.getCategoriesByID(catId);
        return new ResponseEntity(getbyId,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{catId}")
    public ResponseEntity<String>delete(@PathVariable("catId") int catId){

        categoryService.deleteCategoryById(catId);
        return new ResponseEntity("Category Delete Successfully",HttpStatus.OK);
    }


}
