package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.commonPackage.ListMixin;
import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@Service
public class ProductService implements ListMixin<Product> {
    List<Product> products=new ArrayList<>();
    @Autowired
    ProductRepository productRepository;

    public Product insertProducts(Product product) {
        productRepository.save(product);
        products.add(product);
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


    @Override
    public List<Product> getRecords() {
        return products;
    }

    @Override
    public int size() {
        return products.size();
    }

    @Override
    public boolean isEmpty() {
        return products.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Product> action) {
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
    public boolean add(Product product) {
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
    public boolean addAll(Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super Product> filter) {
        return ListMixin.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<Product> operator) {
        ListMixin.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Product> c) {
        ListMixin.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public Product get(int index) {
        return null;
    }

    @Override
    public Product set(int index, Product element) {
        return null;
    }

    @Override
    public void add(int index, Product element) {

    }

    @Override
    public Product remove(int index) {
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
    public ListIterator<Product> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return null;
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<Product> spliterator() {
        return ListMixin.super.spliterator();
    }

    @Override
    public Stream<Product> stream() {
        return ListMixin.super.stream();
    }

    @Override
    public Stream<Product> parallelStream() {
        return ListMixin.super.parallelStream();
    }
}
