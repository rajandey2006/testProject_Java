package encapsulation;

// We will be hiding data as part of encapsulation using access specifier
// Access specifiers are special keywords used in order to describe/define level of access that a variable can have
// public, private, protected and
// private variable is not accessible outside the class where it is defined
// we use setter and getter methods (which is always public) to access private variables
public class SampleEncap {

    private int pin = 1234567;

    public void getPin(){
        System.out.println("The current PIN is " +pin);
    }

    public void setPin(int new_pin){

        pin = new_pin;
        System.out.println("The current PIN is " +pin);
    }

}
