package com.ab.collections.lists;

import com.ab.collections.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class ReadOnlyListDemo {
    public static void main(String[] args) {
        List<Employee> listOfEmployees=new ArrayList<>();
        listOfEmployees.add(new Employee(1, "Faizan", 1000));
        listOfEmployees.add(new Employee(2, "Arun", 1000));
        listOfEmployees.add(new Employee(3, "Amit", 1000));
        listOfEmployees.add(new Employee(4, "Noman", 1000));
        listOfEmployees.add(new Employee(5, "John", 1000));

        UnmodifiableList<Employee> unmodifiableList = new UnmodifiableList<>(listOfEmployees);

        System.out.println(unmodifiableList.size());
        unmodifiableList.add(new Employee(1, "Ritu", 1000));
        unmodifiableList.clear();
    }
}
