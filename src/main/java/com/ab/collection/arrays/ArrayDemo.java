package com.ab.collection.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //intialization
        int[] ids = new int[10];
        //int[] ids = new int[]{1,2,3,4,5};
        //int[] ids = {1,2,3,4,5};
        //int []ids = new int[10];
        //int [] ids = new int[10];
        //int ids[] = new int[10];
        //int ids [] = new int[10];
        //int[] ids;//not valid as down in the we are using it and compiler will complain
        int[] ids1;//valid as we are not using this in the code
        int[] ids2,ids3;

        //Accessing and Iteration
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i+1;
            System.out.print(ids[i]);
        }

        System.out.println();

        for (int id: ids) {
            System.out.print(id);
        }

        System.out.println();

        //Arrays methods
        String[] instruments = new String[]{"Guitar","drums","bass"};
        Arrays.sort(instruments);
        System.out.println(Arrays.toString(instruments));

        int[] fib = new int[]{0,1,5,2,3,1,8,13};
        Arrays.sort(fib);
        System.out.println(Arrays.binarySearch(fib,3));

        //Comparison

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(new int[]{1,2}, new int[]{4}));
        System.out.println(Arrays.equals(new int[]{1,2}, new int[]{4}));
    }
}
