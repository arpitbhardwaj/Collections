package com.ab.collections;

import java.util.Comparator;

import static java.util.Comparator.*;

public class Product {
    //Java8
    //public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    //public static final Comparator<Product> BY_WEIGHT = (o1, o2) -> Integer.compare(o1.getWeight(),o2.getWeight());
    public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getWeight(),o2.getWeight());
        }
    };
    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
