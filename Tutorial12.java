// About classes in Java.

// Declaring a class
class MyNum {
    int num = 10;
}

// Another class.
class MyClass2 {
    int num2 = 5;
}

// Public class must have the same name as the java file with .java extension.
public class Tutorial12 {
    public static void main(String[] args) {


        // Creating an instance/object of the MyNum class.
        MyNum obj = new MyNum();
        System.out.println("The value of the number insiide the class MyNum : " + obj.num);

        

    }
}
