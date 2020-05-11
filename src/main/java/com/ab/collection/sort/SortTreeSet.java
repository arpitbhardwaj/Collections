package com.ab.collection.sort;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Arpit Bhardwaj
 */
public class SortTreeSet {
    private static class Drink implements Comparable{
        public String name;
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Drink one = new Drink();
        Drink two = new Drink();
        one.name = "Coffee";
        two.name = "tea";
        TreeSet set = new TreeSet();
        set.add(one);
        set.add(two);
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Drink c = (Drink) itr.next();
            System.out.println(c.name);
        }
    }
}


