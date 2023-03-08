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

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    void shouldCreateNewCategorySuccessfully() {
        Category category = new Category(1L, "myName", "mySlug", "description");

        Products products = new Products(1, "mobile", "android", "url", 100L, category);

        given(productRepository.save(products)).willReturn(products);
    }
}
