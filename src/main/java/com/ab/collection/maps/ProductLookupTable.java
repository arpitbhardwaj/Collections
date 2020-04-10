package com.ab.collection.maps;

import com.ab.collection.model.NewProduct;

/**
 * @author Arpit Bhardwaj
 */
public interface ProductLookupTable {

    NewProduct lookupById(int id);

    void addProduct(NewProduct product);

    void clear();
}
