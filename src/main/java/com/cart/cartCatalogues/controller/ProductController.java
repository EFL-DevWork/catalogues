package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.model.Products;
import com.cart.cartCatalogues.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Products> insertCategories(Products products) {
        Products newProducts = productService.insertProducts(products);
        return new ResponseEntity<>(newProducts, HttpStatus.CREATED);

    }

}
