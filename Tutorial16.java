// The this keyword in java.

/*
The this keyword in Java refers to the current object in a method or constructor. The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
*/

class MyClass {

    // Class attributes.
    int year;
    String brand;

    // Constructor with one argument and calling another constructor of the same class with two arguments.
    public MyClass(String brand) {
        this(1920, brand);
    }

    // Constructor second of the same class, having two argments.
    public MyClass(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }


    // Output the result , Printing the attributes.
    public void info() {
        System.out.println("Year : " + year + " ,Brand : " + brand);
    }
}


public class Tutorial16 {
    public static void main(String[] args) {

        // Creating the object of the class with one argument in the constrcutor.
        MyClass obj1 = new MyClass("Ford");

        // Creating the object of the class with two arguments in the constructor.
        MyClass obj2 = new MyClass(2000, "Toyota");

        System.out.println("obj1 : " + obj1.year + " " + obj1.brand);
        System.out.println("obj2 : " + obj2.year + " " + obj2.brand);
    }
}