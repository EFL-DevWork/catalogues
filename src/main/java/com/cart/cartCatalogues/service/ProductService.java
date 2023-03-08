package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Products;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Products insertProducts(Products products) {
        productRepository.save(products);
        return products;
    }

}
