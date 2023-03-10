package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product insertProducts(Product product) {
        productRepository.save(product);
        return product;
    }

    public Optional<Product> getProductsByID(int id) {
        return productRepository.findById(id);
    }

    public void deleteProductsById(int id) {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProductsById(int category_id) {
        return productRepository.getAllProductsByCategoryId(category_id);
    }


}
