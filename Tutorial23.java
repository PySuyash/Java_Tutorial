// About Interface in java.

/* 
An interface is an abstract class, you cannot initiate it or cannot create objects of it.
Only abstract methods defined inside the interface, However after java 8 and 8.5 you can define the static methods inside the interface making them call using the interface name, and also define the body the methods inside the interface. Using the default keyword and static to make them static. Interface cannot be extends but uses implements. Interface also used to implement multiple inheritance.
*/


// Creating an interface.
interface Car {

    // Declaring a variable inside the interface.
    // Implicitly Treated as : public static final String interfaceName = "Car";
    String InterfaceName = "Car"; 


    // Abstract methods inside the interface, body must be declare inside the child classes.
    public void getBrand();
    public void getTopSpeed();


    // To define the body of this specific default function inside the child class use the @Override
    public default void getinterfaceName() {
        System.out.println("We are inside the Car interface.");
    }


    // Static methods in the interface usually called using the interface name.
    public static void StaticMethod() {
        System.out.println("This is a static method inside the interface Car.");
    }
}

// To implement multiple inheritance using the interface 
/*

class Toyota implements interface1, interface2 ..... interfaceN {}

*/


class Toyota implements Car {
    
    String Brand;   
    int TopSpeed;
    
    public void setBrandAndTopSpeed(String Brand, int TopSpeed) {
        this.Brand = Brand;
        this.TopSpeed = TopSpeed;
    }

    // Defining the body of the abstract methods from the interface.
    public void getBrand() {
        System.out.println("Brand : " + Brand);
    }

    public void getTopSpeed() {
        System.out.println("Top Speed : " + TopSpeed);
    }

}

public class Tutorial23 {
    public static void main(String[] args) {

        // Creating an object of the Toyota class.
        Toyota T = new Toyota();

        T.setBrandAndTopSpeed("Fortuner", 300);
        T.getBrand();
        T.getTopSpeed();
        T.getinterfaceName();

        // Calling the static method using the interface name.
        Car.StaticMethod();
    }
}
