package Inheritance;

class Grandfather  // Super class -- Attributed of Grandfather only
{
int g_age;
String g_name;
}


class Father1 extends Grandfather// Derived class 1 -- Contains attribute of Grandfather + Father1
{
int f_age;
String f_name;
}


class Child1 extends Father1 // Derived class 2 -- Contains attribute of Grandfather + Father1 + Child1
{
int c_age;
String c_name;
}

public class MultiLevelInheritance
{
    public static void main(String[] args) {
        Father1 f= new Father1();

        f.g_age = 86;
        f.g_name = "Prabhath Dey";
        f.f_age = 69;
        f.f_name = "Bhabesh Dey";


        Child1 c= new Child1();

        c.g_age = 86;

    }


}
