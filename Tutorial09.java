// Java methods 

public class Tutorial09 {

    // Method returning no value.
    static void Greet() {
        System.out.println("Good Morning ...");
    }


    // Parameters in methods.
    static void Name(String name, int age) {
        System.out.println("My name is : " + name + " .I am : " + age + " years old.");
    }


    // Methods returning values.
    static int Square(int a) {
        return a * a;
    }


    // Method Overloading : Methods with same name but with multiple parameters.
    static int Sum(int a, int b) {
        return a + b;
    }

    static double Sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling a method.
        Greet();

        // Calling method with parameters.
        Name("Suyash", 19);

        // Calling method returning a value.
        int result = Square(4);
        System.out.println("The square of 4  : " + result);

        // Calling overloaded methods.
        int result1 = Sum(4, 5);
        double result2 = Sum(2.3, 5.6);

        System.out.println("Calling the int Sum method : " + result1);
        System.out.println("Calling the double Sum method : " + result2);
        
    }
}
