package Inheritance;

class Father2{
  int f_age;
  String f_name;}

class son extends Father2{
    int s_age;
    String s_name;}

class daughter extends Father2{
   int d_age;
   String d_name;}


public class HierarchialInheritance {
    public static void main(String[] args) {

        daughter dt = new daughter();
        dt.f_age = 78;
        dt.f_name = "Steven Smith";
    }
}
