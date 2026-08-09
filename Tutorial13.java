// About attributes in java classes
// Any variable declared inside class is attribute.

class MyClass {
    int a = 10;
    String name = "Suyash";

    // Declaring a variable using final makes it constant.
    final int b = 10;
}

public class Tutorial13 {
    public static void main(String[] args) {
        
        // Creating the instance of the class MyClass.
        MyClass obj = new MyClass();

        // Printing the attributes.
        System.out.println(obj.a);
        System.out.println(obj.name);

        // Overriding the attributes.
        obj.a = 20;
        System.out.println(obj.a);

        // If we have multiple objects then value belongs to objects differently.
        MyClass Obj1 = new MyClass();
        MyClass Obj2 = new MyClass();

        Obj1.a = 30;
        Obj2.a = 40;

        System.out.println("The value of a for Obj1 : " + Obj1.a);
        System.out.println("The value of a for Obj2 : " + Obj2.a);


        System.out.println("The constant variable b : " + Obj1.b);
    }
}
