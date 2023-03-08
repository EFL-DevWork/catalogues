package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CategoryServiceTest {

    private CategoryRepository categoryRepository;

    @BeforeEach
    public void beforeEach(){
        categoryRepository = mock(CategoryRepository.class);
    }

    @Test
    void shouldCreateNewCategorySuccessfully(){
        Category category = new Category(1L,"myName","mySlug","description");
        when(categoryRepository.save(category)).thenReturn(category);
    }
}
