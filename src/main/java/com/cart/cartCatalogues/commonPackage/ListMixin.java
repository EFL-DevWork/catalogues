package com.cart.cartCatalogues.commonPackage;

import java.util.List;

public interface ListMixin<T> extends List<T> {

    List<T> getRecords();

    @Override
    default int size() { return getRecords().size();}

    @Override
    default boolean isEmpty() {return getRecords().isEmpty();}
}
