package com.ab.collection.lists;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 *
 * List are indexed by position
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        //List list2 = new ArrayList();//valid
        //Collection list3 = new ArrayList();//valid
        //ArrayList arrayList = new ArrayList();//valid
        //ArrayList arrayList2 = new ArrayList(100);//valid
        //ArrayList arrayList3 = new ArrayList(arrayList);//valid

        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("orange");

        System.out.println(colors);

        colors.add(1,"blue");//throws IndexOutOfBoundsException for invalid indexes
        //colors.clear();//Removes all of the elements from this list
        //colors.remove(0);//throws IndexOutOfBoundsException for invalid indexes

        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            System.out.printf("%s ",colors.get(i));
        }

        System.out.println();
        for (String color:
             colors) {
            System.out.printf("%s ",color);
        }

        System.out.println();
        colors.forEach(c -> System.out.printf("%s ",c));

        System.out.println();
        colors.forEach(System.out::printf);

        colors.remove("blue");

        System.out.println();
        colors.forEach(c -> System.out.printf("%s ",c));

        colors.remove(1);

        System.out.println();
        colors.forEach(c -> System.out.printf("%s ",c));

        //will not remove all elements and the size() is dynamic
        /*for (int i = 0; i < colors.size(); i++) {
            colors.remove(i);
        }

        System.out.println();
        colors.forEach(c -> System.out.printf("%s ",c));*/

        //throw ConcurrentModificationException
        /*for (String color:
                colors) {
            colors.remove(color);
        }

        System.out.println();
        colors.forEach(c -> System.out.printf("%s ",c));*/

        //ArrayList tp Array
        Object[] colorsArr = colors.toArray();

        System.out.println();
        System.out.println(Arrays.toString(colorsArr));

        String[] colorsArr2 = colors.toArray(new String[0]);

        System.out.println(Arrays.toString(colorsArr));

        //Array to ArrayList
        String[] shapes = new String[]{"square","circle","rectangle"};
        //returns a semi immutable list
        //returns a fixed size list whose length is equal to length of passed array
        //swap an element is allowed, no addition and deletion

        List<String> shapesList = Arrays.asList(shapes);


        System.out.println(shapesList);
        System.out.println(shapesList.getClass().getName());

        //shapesList.add("hexagon");// Not allowed throws UnsupportedOperationException
        //shapesList.remove("circle");// Not allowed throws UnsupportedOperationException

        //return a immutable list
        List<String> shapesList2 = List.of(shapes);

        System.out.println(shapesList2);
        System.out.println(shapesList2.getClass().getName());
        //shapesList2.add("hexagon");// Not allowed throws UnsupportedOperationException
        //shapesList2.remove("circle");// Not allowed throws UnsupportedOperationException

        //to get actual list, need to do old school method
        List<String> shapeList3 = new ArrayList<>();

        for (String shape:
             shapes) {
            shapeList3.add(shape);
        }

        System.out.println(shapeList3);
        System.out.println(shapeList3.getClass().getName());

        //linked list is the implementation of list and queues
        LinkedList<String> orders = new LinkedList<>();
        orders.add("o1");
        orders.add("o2");
        orders.add("o3");
        System.out.println(orders.get(1));

        //methods come from queues
        orders.addFirst("o4");
        orders.addLast("o5");
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);
    }
}
