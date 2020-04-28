package com.ab.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Arpit Bhardwaj
 *
 * Fail-fast iterators throw an exception(ConcurrentModificationException) if the collection is modified while iterating over it.
 * Example: ArrayList iterator
 *
 * Fail-safe iterators means they will not throw any exception even if the collection is modified while iterating over it.
 * Example: CopyOnWriteArrayList iterator
 *
 * Downside of Fail-safe iterators
 * 1. They will not reflect the latest state of the collection.
 * 2. It requires extra memory as it clones the collection.
 */
public class FailSafeFailFast {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        List<Integer> copyArrayList = new CopyOnWriteArrayList<>();
        copyArrayList.add(1);
        copyArrayList.add(2);
        copyArrayList.add(3);

        //failFastIterators1(arrayList);
        //failFastIterators2(arrayList);
        //failSafeIterators1(copyArrayList);
        failSafeIterators2(copyArrayList);
    }

    private static void failSafeIterators1(List<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        //Unlike the fail-fast iterators, these iterators traverse over the clone of the collection.
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 1){
                arrayList.remove(next);
            }
            /*if (next == 1){
                iterator.remove();//throws java.lang.UnsupportedOperationException
            }*/
        }

        System.out.println(arrayList.toString());
    }

    private static void failSafeIterators2(List<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        arrayList.remove(0);
        //iterator.remove(); //throws java.lang.UnsupportedOperationException
        //Unlike the fail-fast iterators, these iterators traverse over the clone of the collection.
        while (iterator.hasNext()){
            Integer next = iterator.next();
        }

        System.out.println(arrayList.toString());
    }

    private static void failFastIterators1(List<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            arrayList.remove(next);//throws java.util.ConcurrentModificationException

            /*If we remove/add the element using the remove() or add() of iterator instead of collection,
            then in that case no exception will occur. It is because the remove/add methods of iterators
            call the remove/add method of collection internally, and also it reassigns the expectedModCount to new modCount value.*/

            /*if (next == 1){
                iterator.remove();
            }*/
        }

        System.out.println(arrayList.toString());
    }

    private static void failFastIterators2(List<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        arrayList.remove(0);//throws java.util.ConcurrentModificationException
        //iterator.remove();// throws java.lang.IllegalStateException

        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println(arrayList.toString());
    }
}
