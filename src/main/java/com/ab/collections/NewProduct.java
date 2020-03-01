package com.ab.collections;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

/**
 * @author Arpit Bhardwaj
 */
public class NewProduct {
    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    private final int id;
    private final String name;
    private final int weight;

    public NewProduct(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "NewProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewProduct product = (NewProduct) o;
        return id == product.id &&
                weight == product.weight &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight);
    }
}
