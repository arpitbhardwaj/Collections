package com.ab.collections.defining_iterating;

import com.ab.collections.Product;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("WoodenDor", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("window", 20);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);
    }
}
