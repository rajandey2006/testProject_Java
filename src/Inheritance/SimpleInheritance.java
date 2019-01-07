package Inheritance;

class Father
{
String f_name;
int f_age;
String f_religion;
}


class Child extends Father // extends keyword is used to extend properties of father to child through simple inheritance
{
int c_age;
String c_name;
String c_school;
}


public class SimpleInheritance {

    public static void main(String[] args)
    {

        Child ch = new Child();

        ch.f_name = "Rajan Dey";
        ch.f_age = 40;
        ch.c_name = "Ridhima Dey";

        System.out.println(ch.f_name);
        System.out.println(ch.f_age);
        System.out.println(ch.c_name);

    }
}
