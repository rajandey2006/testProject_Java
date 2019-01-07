package com.edureka;

public class Student {

    private int roll_no; //declaration of variables  -- Called INSTANCE variable -- as they are defined within a call but outside objects
    private String name;
    private String college;

    Student(int i, String n, String c) {

    }

    Student() {

    }

    void display() {

        System.out.println("Roll number is " + roll_no);
        System.out.println("Name is " + name);
        System.out.println("College name is " + college);
    }


    // Constructor - This is a special member of a class which is used to initialize INSTANCE variable

    public static void main(String[] args) {

        Student s = new Student(1, "Steve", "Oxford");     // new > operator which will allocate memory in the heap region for the object created for any    partucular class, Student() is a constructor (Default constructor) to create an object of the class named Student. This contructor will also initialize all the instance variable to its default values ....

        Student s1 = new Student(2, "George", "Oxford"); // passing arg
        Student s2 = new Student(); // passing arg

        s.display();
        s1.display();
        s2.display();
    }
}


