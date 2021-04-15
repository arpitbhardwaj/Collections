package com.ab.collection.arrays;

import java.util.Arrays;
/**
 * @author Arpit Bhardwaj
 */
public class MainArgs {
    //valid
    /*public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }*/

    //valid
    /*public static void main(String args[]) {
        System.out.println(Arrays.toString(args));
    }*/
    //valid
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
    }
}
