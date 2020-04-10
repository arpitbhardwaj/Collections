package com.ab.collection.maps;

import com.ab.collection.model.NewProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Arpit Bhardwaj
 */
public class LookupTableComparison {
    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20000;

    private static final List<NewProduct> products = generateProducts();

    private static List<NewProduct> generateProducts() {
        final List<NewProduct> products = new ArrayList<>();
        final Random random = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new NewProduct(i,"Product"+i, 10+random.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }

    public static void main(String[] args) {
        runLookups(new NaiveProductLookupTable());
        runLookups(new MapProductLookupTableImpl());
    }

    private static void runLookups(final ProductLookupTable productLookupTable) {
        final List<NewProduct> products = LookupTableComparison.products;
        System.out.println("Running lookup with " + productLookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();

            for (NewProduct product:products
                 ) {
                productLookupTable.addProduct(product);
            }
            for (NewProduct product:products
                 ) {
                final NewProduct result = productLookupTable.lookupById(product.getId());
                if (result != product){
                    throw new IllegalStateException("Look up table returned wrong result for " + product.getName());
                }
            }
            productLookupTable.clear();
            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}
