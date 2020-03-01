package com.ab.collections.lists;

import com.ab.collections.Product;
import com.ab.collections.Supplier;

public class ProductFixtures {
    public static Product door = new Product("Wooden Door", 35);
    public static Product window = new Product("GLass Window", 10);
    public static Product floorPanel = new Product("Floor Panel", 25);

    public static Supplier bobs = new Supplier("Bobs Household Supplies");
    public static Supplier kates = new Supplier("Kates home goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);
        bobs.products().add(window);
        kates.products().add(floorPanel);
        //kates.products().add(door);
        kates.products().add(new Product("Wooden Door", 35) );
    }
}
