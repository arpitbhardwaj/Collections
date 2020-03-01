package com.ab.collections.lists;

import com.ab.collections.Employee;

import java.util.AbstractList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class UnmodifiableList<T> extends AbstractList<T> {

    private List<T> employeeList;

    public UnmodifiableList(List<T> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public T get(int index) {
        return this.employeeList.get(index);
    }

    @Override
    public int size() {
        return this.employeeList.size();
    }
}
