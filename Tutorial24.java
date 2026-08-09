// Anonymous class in java.

/*

An anonymous class is a class withoud a name it is created and used at the same time. Often used to override the behaviour of methods of an existing class without writing a seperate class file.
*/


class MyClass {
    public void myMethod() {
        System.out.println("Hey, I am inside myMethod in the MyClass.");
    }
}

// Creating the interface.
interface Greetings {
    void sayHello();
}

public class Tutorial24 {
    public static void main(String[] args) {

        // Creating an anonymous class to override the behaviour of the myMethod.
        MyClass MC = new MyClass() {
            public void myMethod() {
                System.out.println("Hey, I am inside the myMethod inside the Tutorial24");
            }
        };

        // Creating an anonymous class for the greetings inerface.
        Greetings greet = new Greetings() {
            public void sayHello() {
                System.out.println("Hello Everyone.");
            }
        };

        
        MC.myMethod();
        greet.sayHello();
    }
}
