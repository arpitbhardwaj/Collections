package com.ab.collection.set;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 *
 * HashSet: Hashset is indexed by hashcode and uses element hashCode method for the same
 * TreeSet:orders(sort) the elements during add and uses compareTo method for the same
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> primeNumbers1 = new HashSet<>();
        Set<Integer> primeNumbers2 = new TreeSet<>();

        primeNumbers1.add(71);
        primeNumbers1.add(61);
        primeNumbers1.add(41);
        primeNumbers1.add(1);
        System.out.println(primeNumbers1);
        //hashset cannot be sorted
        //collections sort only accepts list type
        //Collections.sort(primeNumbers1);//compile error

        primeNumbers2.add(71);
        primeNumbers2.add(61);
        primeNumbers2.add(41);
        primeNumbers2.add(1);
        System.out.println(primeNumbers2);
    }
}
