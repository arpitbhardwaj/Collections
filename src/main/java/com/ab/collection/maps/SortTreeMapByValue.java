package com.ab.collection.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arpit Bhardwaj
 *
 * A TreeMap is always sorted based on its keys,
 * however if you want to sort it based on its values then you can build a logic to do this using comparator.
 */
public class SortTreeMapByValue {

    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("Key1", "Jack");
        treeMap.put("Key4", "Tom");
        treeMap.put("Key2", "Rick");
        treeMap.put("Key3", "Kate");
        treeMap.put("Key5", "Steve");

        //by default sorted by key natural ordering
        System.out.println(treeMap);

        Map sortedMap = sortByValues(treeMap);

        //sort by value
        System.out.println(sortedMap);
    }

    private static <K, V extends Comparable<V>> Map<K,V> sortByValues(final Map<K, V> map) {

        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K k1, K k2) {
                int compare =  map.get(k1).compareTo(map.get(k2));
                if (compare == 0){
                    return 1;
                }else{
                    return compare;
                }
            }
        };

        Map<K,V> sortedByValues = new TreeMap<>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }


}
