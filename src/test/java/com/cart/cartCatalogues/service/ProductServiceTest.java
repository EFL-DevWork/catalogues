package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;
    Category category = new Category(1L, "myName", "mySlug", "description");

    Product product = new Product(1, "mobile", "android", "url", 100L, category);


    @Test
    void shouldCreateNewProductSuccessfully() {
        given(productRepository.save(product)).willReturn(product);
    }

    @Test
    void shouldReturnExistingProductSuccessfullyGivenCategoryId() {
        given(productRepository.findById(product.getProduct_id())).willReturn(Optional.of(product));
    }

    @Test
    void shouldDeleteExistingProductSuccessfullyGivenCategoryId() {
        willDoNothing().given(productRepository).deleteById(product.getProduct_id());

        productService.deleteProductsById(product.getProduct_id());

        verify(productRepository, times(1)).deleteById(product.getProduct_id());
    }

    @Test
    void shouldReturnAllProductsForCategorySuccessfullyGivenCategoryId() {
        given(productRepository.getAllProductsByCategoryId(category.getId())).willReturn(product);
    }
}
