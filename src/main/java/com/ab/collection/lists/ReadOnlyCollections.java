package com.ab.collection.lists;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 */
public class ReadOnlyCollections {
    public static void main(String[] args) {
        List<String> readOnlyList = new ArrayList<>();
        //readOnlyList.add("name");
        readOnlyList = Collections.unmodifiableList(readOnlyList);
        //readOnlyList.add("what");//java.lang.UnsupportedOperationException

        Set<String> readOnlySet = new HashSet<>();
        readOnlySet = Collections.unmodifiableSet(readOnlySet);
        //readOnlySet.add("set");

        Map<String,Integer> readOnlyMap = new HashMap<>();
        readOnlyMap = Collections.unmodifiableMap(readOnlyMap);
        //readOnlyMap.put("one",1);
    }
}
