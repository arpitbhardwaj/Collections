package com.ab.collection.set;

import com.ab.collection.model.Product;
import com.ab.collection.model.Supplier;

import java.util.*;

import static com.ab.collection.model.Product.BY_WEIGHT;

public class ProductCatalogue implements Iterable<Product> {

    //private final Set<Product> products = new HashSet<>();

    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    //to is inclusive and from is exclusive
    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for (Product product:products) {
            if(product.getWeight() > 20){
                return product;
            }
        }
        return products.last();
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }
}
