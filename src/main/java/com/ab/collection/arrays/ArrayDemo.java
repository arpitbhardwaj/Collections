package com.ab.collection.arrays;

import java.util.Arrays;

/**
 * @author Arpit Bhardwaj
 *
 *
Method	    When arrays are the same	When arrays are different
equals()	true	                    false
compare()	0	                        Positive or negative number
mismatch()	-1	                        Zero or positive index
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //initialization
        int[] ids = new int[10];
        //int[] ids = new int[]{1,2,3,4,5};
        //int[] ids = {1,2,3,4,5};//anonymous array

        //you can type the [] before or after the name, and adding a space is optional.
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
        //If both arrays are the same length and have the same values in each spot in the same order, return zero.
        //If all the elements are the same but the second array has extra elements at the end, return a negative number.
        //If all the elements are the same but the first array has extra elements at the end, return a positive number.
        //If the first element that differs is smaller in the first array, return a negative number.
        //If the first element that differs is larger in the first array, return a positive number.
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1}));//1
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2}));//0
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2,3}));//-1
        System.out.println(Arrays.compare(new int[]{2,3}, new int[]{1,3}));//1
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{2,3}));//-1
        //null is smaller than any other value.
        //For numbers, normal numeric order applies.
        //For strings, one is smaller if it is a prefix of another.
        //For strings/characters, numbers are smaller than letters.
        //For strings/characters, uppercase is smaller than lowercase.
        System.out.println(Arrays.compare(new String[]{"abcd"}, new String[]{"ABCD"}));//uppercase is treated as smaller

        //mismatch() returns the index of the first element that is different.-1 if the arrays are equal
        System.out.println(Arrays.mismatch(new int[]{1,2}, new int[]{1,2,4}));

        //all below declaration are valid
        //int[][] multi = new int[2][2];
        //int[]  [] multi = new int[2][2];
        //int[][] multi = new int[2]     [2];
        //int[] multi   [] = new int[2][2];
        //int[] multi2d [], multi3d [][];  // a 2D AND a 3D array

        //asymmetric multidimensional array
        int [][] asymulti = new int[4][];
        asymulti[0] = new int[5];
        asymulti[1] = new int[3];
    }
}
