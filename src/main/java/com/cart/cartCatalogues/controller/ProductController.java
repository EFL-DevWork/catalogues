package com.cart.cartCatalogues.controller;

import com.cart.cartCatalogues.exception.ResourceNotFoundException;
import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> insertProduct(@RequestBody Product product) {
        Product newProduct = productService.insertProducts(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/get/productId/{productId}")
    public ResponseEntity<Optional<Product>> getById(@PathVariable("productId") int productId) {
        Optional<Product> getById = productService.getProductsByID(productId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + productId);
        }
        return new ResponseEntity<>(getById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteById(@PathVariable("productId") int productId) {
        Optional<Product> getById = productService.getProductsByID(productId);
        if (getById.isEmpty()) {
            throw new ResourceNotFoundException("User Not Found wth id: " + productId);
        }
        productService.deleteProductsById(productId);
    }

    @GetMapping("/get/categoryId/{categoryId}")
    public ResponseEntity<List<Product>> getAllProductsByCategoryId(@PathVariable("categoryId") int categoryId) {
        List<Product> product = productService.getAllProductsById(categoryId);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
