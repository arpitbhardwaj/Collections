package com.ab.collection.model;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {
        Product door = new Product("WoodenDor", 35);
        Product floorPanel = new Product("Floor Panel", 25);

        //create
        Product[] products = {door,floorPanel};
        System.out.println(Arrays.toString(products));
        //add
        Product window = new Product("window", 20);
        products = add(products,window);
        System.out.println(Arrays.toString(products));
        //duplicate
        products = add(products,window);
        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product[] array, Product product) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array,length+1);
        newArray[length] = product;
        return newArray;
    }
}
