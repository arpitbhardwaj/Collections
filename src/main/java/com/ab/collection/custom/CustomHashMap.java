package com.ab.collection.custom;

import com.ab.collection.model.Entry;

/**
 * @author Arpit Bhardwaj
 * STEP1: Create a simple data structure with key, value and which can also extend as linked list
 * STEP2: Couple of important utility methods : getSupplementalHash() getBucketNumber()
 * STEP3: PUT Method
 * STEP4: GET Method
 */
public class CustomHashMap<K, V> {

    private int DEFAULT_BUCKET_COUNT = 10;

    private Entry<K, V>[] buckets;

    public CustomHashMap() {
        buckets = new Entry[DEFAULT_BUCKET_COUNT];
    }

    public Entry get(K key){
        int hash = getSupplementHash(key.hashCode());
        int bucket = getBucketNumber(hash);
        Entry existingEntry = buckets[bucket];

        while (existingEntry != null){
            System.out.println("Traversing the list inside the bucket for the key "
                            + existingEntry.getKey());
            if (existingEntry.getKey().equals(key)){
                return existingEntry;
            }
            existingEntry = existingEntry.getNext();
        }
        return null;
    }

    public void put(K key, V value){
        int hash = getSupplementHash(key.hashCode());
        int bucket = getBucketNumber(hash);
        Entry existingEntry = buckets[bucket];

        while (existingEntry != null){
            if (existingEntry.getKey().equals(key)){
                System.out.println("duplicate key value pair, replacing existing key "
                                + key + ", with value " + value);
                existingEntry.setValue(value);
                return;
            }else{
                System.out.println("Collision detected for key " + key
                        + ", adding element to the existing bucket");
            }
            existingEntry = existingEntry.getNext();
        }

        System.out.println("PUT adding key:" + key + ", value:" + value + " to the list");
        Entry newEntry = new Entry(key, value);
        buckets[bucket] = newEntry;
    }
    private int getSupplementHash(int hash){

        return 0;
    }

    private int getBucketNumber(int hash){
        return 0;
    }
}
