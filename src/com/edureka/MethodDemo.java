package com.edureka;

public class MethodDemo {

    void addition() { // method w/o return type and w/o parameter
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    void add(int a, int b){  // method w/o return type and w/ parameter
        System.out.println(a+b);
    }


    public static void main(String[] args){

        MethodDemo m = new MethodDemo();
        m.addition(); // calling the method addition
        m.add(40,50);  // calling the method add
        m.add(50,50);
        m.add(70,80);
    }



}
