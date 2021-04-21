package com.ab.collection.basic;

import com.ab.collection.model.Product;

import java.util.*;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("GLass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        //System.out.println(products);

        //by iterator
        final Iterator<Product> productIterator = products.iterator();
        /*while (productIterator.hasNext()){
            Product product = productIterator.next();
            System.out.println(product);
        }*/

        //by for each loop
        for (Product product:products) {
            System.out.println(product);
        }

        //can only be done using iterator
        while (productIterator.hasNext()){
            Product product = productIterator.next();
            if(product.getWeight() > 20){
                System.out.println(product);
            }
            else{
                productIterator.remove();
            }
        }

        //with for each throws ConcurrentModificationException
        /*try{
            for (Product product:products) {
                if(product.getWeight() > 20){
                    System.out.println(product);
                }
                else{
                    //products.remove(product);
                    //products.clear();
                    //products.add(window);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));
        System.out.println(products.contains(window));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);

        System.out.println(products.containsAll(otherProducts));
        products.removeAll(otherProducts);
        System.out.println(products);

        //searching and sorting
        //List<Integer> integerList = List.of(4, 8, 1, 3, 9);//Returns an unmodifiable list
        List<Integer> integerList = new ArrayList<>(List.of(4, 8, 1, 3, 9));
        Collections.sort(integerList);//throws UnsupportedOperationException due to unmodifiable list
        System.out.println(Collections.binarySearch(integerList,10));


    }
}
