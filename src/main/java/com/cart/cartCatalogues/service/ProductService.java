package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product insertProducts(Product product) {
        productRepository.save(product);
        return product;
    }

    public Optional<Product> getProductsByID(long id) {
        return productRepository.findById(id);
    }

    public void deleteProductsById(long id) {
        productRepository.deleteById(id);
    }

    public Product getAllProductsById(long category_id) {
        return productRepository.getAllProductsByCategoryId(category_id);
    }

}
