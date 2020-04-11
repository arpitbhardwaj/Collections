package com.ab.collection.custom;

import java.util.AbstractList;

/**
 * @author Arpit Bhardwaj
 */
public class CustomArrayList<T> extends AbstractList<T> {
    private Object[] values;

    public CustomArrayList() {
        this.values = new Object[0];
    }

    @Override
    public T get(int index) {
        return (T) values[index];
    }

    @Override
    public boolean add(T o) {
        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newValues[i] = values[i];
        }
        newValues[size()] = o;
        values = newValues;
        return true;
    }

    @Override
    public int size() {
        return values.length;
    }
}
