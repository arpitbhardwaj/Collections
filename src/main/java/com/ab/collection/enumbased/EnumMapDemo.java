package com.ab.collection.enumbased;

import java.util.EnumMap;
import java.util.Iterator;

/**
 * @author Arpit Bhardwaj
 *
 * All keys used in EnumMap must be  from same Enum type which is specified while creating EnumMap
 *  EnumMap is ordered collection and they are maintained in the natural order of their keys
 *
 * You can see EnumMap.java source and in comments givent that Iterators returned by the collection views are weakly consistent:
 * they will never throw ConcurrentModificationException
 *
 * EnumMap works on similar principles, but it uses Object[] to store values while key (index) is implicitly inferred from Enum.ordinal().
 */
public class EnumMapDemo {
    public enum State{
        NEW,RUNNING,WAITING,FINISHED;
    }

    public static void main(String[] args) {
        EnumMap<State,String> stateMap = new EnumMap<State, String>(State.class);

        stateMap.put(State.RUNNING,"running state");
        stateMap.put(State.WAITING,"waiting state");
        stateMap.put(State.NEW,"new state");
        stateMap.put(State.FINISHED,"finished state");

        System.out.println(stateMap);
        System.out.println("Size of state enum map : " + stateMap.size());

        Iterator<State> stateIterator = stateMap.keySet().iterator();

        while (stateIterator.hasNext()){
            State state = stateIterator.next();
            System.out.println("Key : "
                    + state
                    + " Value : "
                    + stateMap.get(state));
        }
    }
}
