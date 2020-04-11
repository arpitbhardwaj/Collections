package com.ab.collection.custom;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class CustomArrayListDemo {

    public static void main(String[] args) {
        List<Integer> customArrayList = new CustomArrayList<>();

        customArrayList.add(0);
        customArrayList.add(1);
        customArrayList.add(2);

        System.out.println(customArrayList.get(1));

        for (Integer i : customArrayList){
            System.out.println(i);
        }
    }
}
