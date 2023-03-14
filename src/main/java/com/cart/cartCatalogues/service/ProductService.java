package com.cart.cartCatalogues.service;

import com.cart.cartCatalogues.model.Product;
import com.cart.cartCatalogues.repository.ProductRepository;
import com.thoughtworks.commonpackage.util.ListMixin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
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
    public boolean retainAll(Collection<?> c) {
        return false;
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
}
