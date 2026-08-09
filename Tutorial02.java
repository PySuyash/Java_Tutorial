// Variables in Java 

public class Tutorial02 {
    public static void main() {
        String name = "Suyash";
        int num = 5;
        boolean isTrue = true;
        float fVal = 4.57f;     // In Java the decimals by default are treated as double to define the floating point numbers we must use f as a suffix after the decimal number.
        char ch = 'S';

        // declaring multiple variables with the same data types.
        int a = 5, b = 6, c = 10;

        // We can also do this.
        int x, y, z;
        x = y = z = 20;

        System.err.println(name);
        System.err.println(num);
        System.err.println(isTrue);
        System.err.println(fVal);
        System.err.println(ch);

        // for strings + acts as concatination but for numbers acts as addition operator.
        System.out.println("Suyash" + "Mishra"); 
        System.out.println("Suyash" + 5); 
        System.out.println(6 + 5); 


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.err.println(x);
        System.err.println(y);
        System.err.println(z);
    }
}
