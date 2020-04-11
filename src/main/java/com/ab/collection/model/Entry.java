package com.ab.collection.model;

/**
 * @author Arpit Bhardwaj
 *
 * Data Dtructure for Custom Hash Map
 */
public class Entry<K,V> {
    K key;
    V value;
    Entry next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
