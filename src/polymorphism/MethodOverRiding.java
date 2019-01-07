package polymorphism;

// Also called run-time polymorphism -- inheritance is important & a must

class Super {
    void display(){ System.out.println("This is Super class method");}}
class Sub extends Super{
    void display(){System.out.println("This is Sub class method");}}
// Overriding is nothing but overriding implementation of superclass by the sub-class and this can be done is sub-class only but not in the super class ...

public class MethodOverRiding {

    public static void main(String[] args) {

        Sub mor= new Sub();
        mor.display();
    }

}
