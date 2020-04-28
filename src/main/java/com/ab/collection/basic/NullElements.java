package com.ab.collection.basic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Arpit Bhardwaj
 *
 * List: Allows null elements and you can have many null objects in a List because it also allowed duplicates
 *
 * Set: Allow one null element as there is no duplicate permitted
 *
 * Map: Map you can have null values and at most one null key.
 *
 * Hashtable & ConcurrentHashMap: Do not allow null keys or values is because of multi-threaded environment.
 */
public class NullElements {
    public static void main(String[] args) {
        addNullInList();
        addNullInSet();
        addNullInHashMap();
        addNullInHashTable();
        addNullInConcurrentHashMap();
    }

    private static void addNullInConcurrentHashMap() {
        Map<Object,Object> map = new ConcurrentHashMap<>();
        //map.put(null,null);//java.lang.NullPointerException
        //map.put(null,"String1");//java.lang.NullPointerException
        //map.put("String3",null);//java.lang.NullPointerException
        map.put("key","value");
        System.out.println(map);

    }

    private static void addNullInHashTable() {
        Hashtable<Object,Object> hashtable = new Hashtable<>();
        //hashtable.put(null,null);//java.lang.NullPointerException
        //hashtable.put(null,"String1");//java.lang.NullPointerException
        //hashtable.put("String3",null);//java.lang.NullPointerException
        hashtable.put("key","value");
        System.out.println(hashtable);
    }

    private static void addNullInHashMap() {
        Map<Object,Object> map = new HashMap<>();
        map.put(null,null);
        map.put(null,"String1");
        map.put(null,"String2");
        map.put("String3",null);
        map.put("key","value");
        System.out.println(map);
    }

    private static void addNullInSet() {
        Set<Object> set = new HashSet<>();
        set.add(null);
        set.add("string1");
        set.add(null);
        set.add(1);
        System.out.println(set);
    }

    private static void addNullInList() {
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add("string1");
        list.add(null);
        list.add(1);
        System.out.println(list);
    }
}
