package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.Products;
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

    Products products = new Products(1, "mobile", "android", "url", 100L, category);


    @Test
    void shouldCreateNewProductSuccessfully() {
        given(productRepository.save(products)).willReturn(products);
    }

    @Test
    void shouldReturnExistingProductSuccessfullyGivenCategoryId() {
        given(productRepository.findById(products.getProduct_id())).willReturn(Optional.of(products));
    }

    @Test
    void shouldDeleteExistingProductSuccessfullyGivenCategoryId() {
        willDoNothing().given(productRepository).deleteById(products.getProduct_id());

        productService.deleteProductsById(products.getProduct_id());

        verify(productRepository, times(1)).deleteById(products.getProduct_id());
    }

    @Test
    void shouldReturnAllProductsForCategorySuccessfullyGivenCategoryId() {
        given(productRepository.getAllProductsByCategoryId(category.getCategory_id())).willReturn(products);
    }
}
