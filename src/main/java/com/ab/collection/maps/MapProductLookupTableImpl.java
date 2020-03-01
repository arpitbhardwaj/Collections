package com.ab.collection.maps;

import com.ab.collections.NewProduct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arpit Bhardwaj
 */
public class MapProductLookupTableImpl implements ProductLookupTable {

    private final Map<Integer, NewProduct> idToProduct = new HashMap<>();

    @Override
    public NewProduct lookupById(int id) {
        return idToProduct.get(id);
    }

    @Override
    public void addProduct(NewProduct product) {
        final int productId = product.getId();
        if(idToProduct.containsKey(productId)){
            throw new IllegalArgumentException("Unable to add product due to duplicate id : " + product);
        }
        idToProduct.put(productId,product);
    }

    @Override
    public void clear() {
        idToProduct.getClass();
    }
}
