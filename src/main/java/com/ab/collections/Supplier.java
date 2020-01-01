package com.ab.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Supplier {
    private final List<Product> products = new ArrayList<>();

    public Supplier(String bobs_household_supplies) {
    }

    public List<Product> products() {
        return products;
    }
}
