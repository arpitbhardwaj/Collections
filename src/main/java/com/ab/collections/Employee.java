package com.ab.collections;

/**
 * @author Arpit Bhardwaj
 */
public class Employee {
    private int age;
    private String name;
    private double salary;

    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
