// Inner Classes in Java.


// Creating the class Outer.
class Outer {

    // Declaring the variable x in the outer class.
    int x = 5;

    // Creating the Inner class.
    class Inner {

        // Declaring the variable y in the inner class.
        int y = 10;
    }

    // Inner class can also be private but these private classes cannot be accessed via objects.

    /* 
    
    private class Inner {
        int y = 10;
    } 
    
    */


    // If we make the inner class static, i.e., it belongs to the outer class so we can refer to the class directly through class name with referring to the outer class object.

    static class Inner2 {
        int z = 20;
    }
}

public class Tutorial21 {
    public static void main(String[] args) {

        // Creating the object of the outer class myOuter.
        Outer myOuter = new Outer();

        // Creating the object of the inner class myInner.
        Outer.Inner myInner = myOuter.new Inner();

        // Creating the object of the Inner2 class, which is static. We can innitiate the object of the Inner2 class without referring to the outer class object.
        Outer.Inner2 myInner2 = new Outer.Inner2();

        // Printing the variables of the outer and inner class.
        System.out.println("Outer Class : " + myOuter.x);
        System.out.println("Inner Class : " + myInner.y);
        System.out.println("Inner2 Class : " + myInner2.z);
    }
}
