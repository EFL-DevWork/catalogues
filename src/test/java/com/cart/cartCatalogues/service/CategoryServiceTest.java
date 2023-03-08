package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.model.CategoryNameId;
import com.cart.cartCatalogues.repository.CategoryRepository;
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
public class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;
    @InjectMocks
    private CategoryService categoryService;
    Category category = new Category(1L, "myName", "mySlug", "description");


    @Test
    void shouldCreateNewCategorySuccessfully() {
        given(categoryRepository.save(category)).willReturn(category);
    }

    @Test
    void shouldReturnExistingCategorySuccessfullyGivenCategoryId() {
        given(categoryRepository.findById(category.getCategory_id().intValue())).willReturn(Optional.of(category));
    }

    @Test
    void shouldDeleteExistingCategorySuccessfullyGivenCategoryId() {
        willDoNothing().given(categoryRepository).deleteById(category.getCategory_id().intValue());

        categoryService.deleteCategoryById(1);

        verify(categoryRepository, times(1)).deleteById(1);
    }

    @Test
    void shouldReturnExistingCategorySuccessfullyGivenCategoryNameId() {
        CategoryNameId categoryNameId = new CategoryNameId(1L, "myName");

        given(categoryRepository.getCategoryNameId()).willReturn(categoryNameId);
    }
}
