package com.ab.collection.maps;

import com.ab.collections.NewProduct;

/**
 * @author Arpit Bhardwaj
 */
public interface ProductLookupTable {

    NewProduct lookupById(int id);

    void addProduct(NewProduct product);

    void clear();
}
