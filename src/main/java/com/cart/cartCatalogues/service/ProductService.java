package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Products;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Products insertProducts(Products products) {
        productRepository.save(products);
        return products;
    }

    public Optional<Products> getProductsByID(long id) {
        return productRepository.findById(id);
    }

    public void deleteProductsById(long id) {
        productRepository.deleteById(id);
    }

    public Products getAllProductsById(long category_id) {
        return productRepository.getAllProductsByCategoryId(category_id);
    }

}
