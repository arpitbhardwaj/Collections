package com.ab.collections.lists;

import com.ab.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public void add(Product product){
        products.add(product);
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public void replace(Product oldProduct, Product newProduct) {
        final int index = products.indexOf(oldProduct);
        if(index != PRODUCT_NOT_PRESENT){
            products.set(index, newProduct);
        }

    }

    public void prepare() {
        //sort list
        products.sort(Product.BY_WEIGHT);
        //find split point
        int splitPoint = findSplitPoint(products);
        //assign views respectively
        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint,products.size());
    }

    private int findSplitPoint(List<Product> products) {
        for (int i=0;i<=products.size();i++){
            final Product product = products.get(i);
            if(product.getWeight() > LIGHT_VAN_MAX_WEIGHT){
                return i;
            }
        }
        return  0;
    }
}
