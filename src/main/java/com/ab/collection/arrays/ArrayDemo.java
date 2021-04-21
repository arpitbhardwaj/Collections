package com.ab.collection.arrays;

import java.util.Arrays;

/**
 * @author Arpit Bhardwaj
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //initialization
        int[] ids = new int[10];
        //int[] ids = new int[]{1,2,3,4,5};
        //int[] ids = {1,2,3,4,5};
        //int []ids = new int[10];
        //int [] ids = new int[10];
        //int ids[] = new int[10];
        //int ids [] = new int[10];

        //int[] ids;//not valid as down in the we are using it and compiler will complain
        //int[] ids = new int[0];//valid create an array of length 0
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
        Arrays.sort(fib);//uses Dual-Pivot Quicksort algorithm
        //Arrays.parallelSort(fib);//uses parallel merge sort

        /***binary search ***/
        //Array should be sorted else it returns un deterministic result.
        //returns index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
        //if element is greater then all elements in array then -arr.length-1
        //if element is smaller then all elements in array then -0-1 = -1
        System.out.println(Arrays.binarySearch(fib,4));

        //Comparison
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        System.out.println(arr1.equals(arr2));//equals deliver same result as == (memory address comparison)
        //same elements in same order comparison
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(new int[]{1,2}, new int[]{4}));
        //smaller,equal,bigger comparison (Java 11 Addition)
        //0 if equal,-1 if arr1 is smaller, +1 if arr2 is larger
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2,3}));
        System.out.println(Arrays.compare(new String[]{"abcd"}, new String[]{"ABCD"}));//uppercase is treated as smaller
        //comparison to find where arrays differ (Java 11 Addition)
        System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1,2,4}));

        //all below declaration are valid
        //int[][] multi = new int[2][2];
        //int[]  [] multi = new int[2][2];
        //int[][] multi = new int[2]     [2];
        //int[] multi   [] = new int[2][2];

    }
}
