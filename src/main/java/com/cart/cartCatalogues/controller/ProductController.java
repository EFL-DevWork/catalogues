package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.exception.ResourceNotFoundException;
import com.cart.cartCatalogues.model.Products;
import com.cart.cartCatalogues.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Products> insertProduct(Products products) {
        Products newProducts = productService.insertProducts(products);
        return new ResponseEntity<>(newProducts, HttpStatus.CREATED);
    }

    @GetMapping("get/{productId}")
    public ResponseEntity<Optional<Products>> getById(@PathVariable("productId") long productId) {
        Optional<Products> getById = productService.getProductsByID(productId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + productId);
        }
        return new ResponseEntity<>(getById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteById(@PathVariable("productId") long productId) {
        Optional<Products> getById = productService.getProductsByID(productId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + productId);
        }
        productService.deleteProductsById(productId);
    }

    @GetMapping("get/{categoryId}")
    public ResponseEntity<Products> getAllProductsByCategoryId(@PathVariable("categoryId") long categoryId) {
        Products products = productService.getAllProductsById(categoryId);

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
