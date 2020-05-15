package com.ab.collection.enumbased;

import com.ab.collection.model.Color;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author Arpit Bhardwaj
 *
 * EnumSet is an abstract class, which means you cannot create its instance using new() operator
 *
 * EnumSet internal representation is extremely efficient and represented as bit vectors.
 * Library itself chooses one of two implementations available depending upon the size of a key universe.
 * RegularEnumSet has chosen if a number of instances are less than 64, otherwise JumboEnumSet is used.
 *
 *  Iterator returned by EnumSet traverse the elements in their natural order,
 *  i.e. the order on which enum constants are declared, or the order returned by ordinal() method.
 *  An EnumSet iterator is weakly consistent and never throws ConcurrentModificationException
 *
 *  EnumSet is backed by a bit array. Since the number of different items you can put in EnumSet is known in advance,
 *  we can simply reserve one bit for each enum value.
 *
 * Thus basic operations like exists or add are constant time (just like HashSet) but they simply need to examine or set one bit.
 * No hashCode() computation. This is why EnumSet is faster.
 * Also more complex operations like union or easily implemented using bit manipulation techniques.
 *
 */
public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<Color> yellowSet = EnumSet.of(Color.RED,Color.GREEN);
        drawLine(yellowSet);
        EnumSet<Color> whiteSet = EnumSet.of(Color.RED,Color.GREEN,Color.BLUE);
        //drawLine(whiteSet);
        EnumSet<Color> pinkSet = EnumSet.of(Color.RED,Color.BLUE);
        drawLine(pinkSet);

        //noneOf() returns an empty EnumSet with specified enum type
        Set<Color> synchronizedSet = Collections.synchronizedSet(EnumSet.noneOf(Color.class));
        //allOf() method creates an enum set containing all elements of specified enum.
        EnumSet<Color> anotherWhiteSet = EnumSet.allOf(Color.class);
        drawLine(anotherWhiteSet);
    }

    private static void drawLine(EnumSet<Color> colorSet) {
        System.out.println("Colors to draw line : " + colorSet);
        for (Color color:
             colorSet) {
            System.out.println("Drawing line in color : " + color);
        }
    }
}
