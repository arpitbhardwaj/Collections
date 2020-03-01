package com.ab.collection.maps;

import com.ab.collections.NewProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class NaiveProductLookupTable implements ProductLookupTable {

    private List<NewProduct> products = new ArrayList<>();

    @Override
    public NewProduct lookupById(int id) {
        for (NewProduct product:products) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(NewProduct product) {
        for (NewProduct product1: products) {
            if(product.getId() == product1.getId()){
                throw new IllegalArgumentException("Unable to add product due to duplicate id : " + product);
            }
        }
        products.add(product);
    }

    @Override
    public void clear() {
        products.clear();
    }
}
