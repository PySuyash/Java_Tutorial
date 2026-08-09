// Methods in Java classes.
/* 
Methods in java classes are same as normal methods, the only thing is new is to call a method using the java class objects.
*/

class MyClass {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Tutorial14 {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        int result = obj.add(4, 5);
        System.out.println(result);
    }
}
