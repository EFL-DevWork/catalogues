package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.commonPackage.ListMixin;
import com.cart.cartCatalogues.model.Category;
import com.cart.cartCatalogues.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@Service
public class CategoryService implements ListMixin<Category> {

    private List<Category> categories=new ArrayList<>();
    @Autowired
    CategoryRepository categoryRepository;

    public Category insertCategories(Category category) {
        categoryRepository.save(category);
        categories.add(category);
        return category;
    }

    public List<Object[]> getCategoriesNameAndID() {
        return categoryRepository.getCategoryNameId();
    }

    public Optional<Category> getCategoriesByID(int id) {

        return categoryRepository.findById(id);
    }

    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }


    @Override
    public List<Category> getRecords() {
        return categories;
    }

    @Override
    public int size() {
        return ListMixin.super.size();
    }

    @Override
    public boolean isEmpty() {
        return ListMixin.super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Category> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Category> action) {
        ListMixin.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return ListMixin.super.toArray(generator);
    }

    @Override
    public boolean add(Category category) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Category> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Category> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super Category> filter) {
        return ListMixin.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<Category> operator) {
        ListMixin.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Category> c) {
        ListMixin.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public Category get(int index) {
        return null;
    }

    @Override
    public Category set(int index, Category element) {
        return null;
    }

    @Override
    public void add(int index, Category element) {

    }

    @Override
    public Category remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Category> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Category> listIterator(int index) {
        return null;
    }

    @Override
    public List<Category> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<Category> spliterator() {
        return ListMixin.super.spliterator();
    }

    @Override
    public Stream<Category> stream() {
        return ListMixin.super.stream();
    }

    @Override
    public Stream<Category> parallelStream() {
        return ListMixin.super.parallelStream();
    }
}
