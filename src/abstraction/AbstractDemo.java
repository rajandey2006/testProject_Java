package abstraction;
/*
public abstract class AbstractDemo {   //Abstract class

abstract void display();  // Abstract method which is just declared without a body
void display1()           // Method is  declared with a body within an abstract class
{ System.out.print("This is a concrete method and not an abstract method");}
} */

public abstract class AbstractDemo {   //Abstract class
    abstract void display();
    void display1()
    { System.out.print("This is a concrete method and not an abstract method");}}

class display2 extends AbstractDemo{
     void display(){
         System.out.print("This is implementation of abstract class by defining display method in the sub-class"); }
    }

    class abstraction {

        public static void main(String[] args) {
           // AbstractDemo abst = new AbstractDemo();   -- Abstract class cannot be instantiated

            display2 d2 = new display2();
            d2.display();
            d2.display1();
        }
    }
