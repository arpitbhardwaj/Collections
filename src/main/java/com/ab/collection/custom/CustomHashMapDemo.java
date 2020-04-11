package com.ab.collection.custom;

import com.ab.collection.model.Student;

/**
 * @author Arpit Bhardwaj
 */
public class CustomHashMapDemo {
    public static void main(String[] args) {
        CustomHashMap<Student, String> customHashMap = new CustomHashMap<>();
        Student e1 = new Student(100, "Niranjan");
        Student e2 = new Student(102, "Sravan");
        Student e3 = new Student(104, "Ananth");
        Student e4 = new Student(106, "Rakesh");
        Student e5 = new Student(108, "Shashi");
        customHashMap.put(e1,"dept1");
        customHashMap.put(e2,"dept2");
        customHashMap.put(e3,"dept3");
        customHashMap.put(e4,"dept4");
        customHashMap.put(e5,"dept5");
    }
}
