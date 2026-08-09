// Access modifier & Non - Access modifier.
/*

Access Modifier : public, private, protected.
Non-Access Modifier : static, final, abstract.


abstract : The abstract keyword is used to define a class which is not initiated. We cannot create the object of the abstract class.
*/

class MyClass {
    public int x = 10; // Accessible anywhere throughout the program.
    protected int y = 20; // Only Accessible in the inherited class.
    private int z = 30; // Only Accessible within the class.


    
    public void valRepresent() {
        System.out.println("Public variable inside MyClass : " + x);
        System.out.println("Public variable inside MyClass : " + y);
        System.out.println("Public variable inside MyClass : " + z);
    }
}

class MyClass2 extends MyClass {
    public void ValInMyClass2() {
        System.out.println("Public vaiable inside MyClass2 : " + x);
        System.out.println("Protected vaiable inside MyClass2 : " + y);
    }
}

public class Tutorial17 {
    public static void main(String[] args) {


        MyClass obj1 = new MyClass();

        obj1.valRepresent();

        MyClass2 obj2 = new MyClass2();

        obj2.ValInMyClass2();
    }
}
