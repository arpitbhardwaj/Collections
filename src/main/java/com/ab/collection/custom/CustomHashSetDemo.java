package com.ab.collection.custom;

/**
 * @author Arpit Bhardwaj
 */
public class CustomHashSetDemo {
    public static void main(String[] args) {
        CustomHashSet<String> customHashSet = new CustomHashSet<>();

        customHashSet.add("India");
        customHashSet.add("Australia");
        customHashSet.add("England");
        customHashSet.add("Australia");

        for (String item:
             customHashSet) {
            System.out.println(item);
        }

    }
}
