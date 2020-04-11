package com.ab.collection.custom;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Arpit Bhardwaj
 */
public class CustomHashSet<E> extends AbstractSet<E> {

    private HashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public CustomHashSet() {
        this.map = new HashMap<>();
    }

    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }
}
