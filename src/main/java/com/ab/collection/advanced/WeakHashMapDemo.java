package com.ab.collection.advanced;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Arpit Bhardwaj
 *
 * WeakHashMap is an implementation of the Map interface that stores only weak references to its keys.
 * Storing only weak references allows a key-value pair to be garbage-collected when its key is no longer referenced outside of the WeakHashMap.
 *
 * It is useful for implementing "registry-like" data structures
 */


public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        final Map<Key,String> weakMap = new WeakHashMap<>();

        Key key1 = new Key("Active");
        Key key2 = new Key("Inactive");

        weakMap.put(key1,"Active Value");
        weakMap.put(key2, "Inactive Value");

        System.out.println(weakMap.toString());

        key1 = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(weakMap.toString());
    }
}

class Key{
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Key{" +
                "key='" + key + '\'' +
                '}';
    }
}
