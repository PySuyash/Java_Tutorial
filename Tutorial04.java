// Type-casting in java:

/* 

Converting one type of data to another is the process of typecasting,

-> Widening Cast: Automatically happens, converting one type to another, from smaller data type to larger

-> Narrowing Cast: Done Manually, converting one type to another, from larger data types to smaller.


NOTE: 'double' data type must be declared with the 'd' as a suffix. i.e., double num = 56.784523d, And the 'float' data type must be declared with the 'f' as suffix. i.e., num = 56.78f.

*/

public class Tutorial04 {
    public static void main(String[] args) {

        // Widening casting
        int myInt = 7;
        double myDouble = myInt;
        System.err.println("Type cast (int -> double) : " + myDouble);

        // Narrowing casting
        double myDouble01 = 5.67;
        int myInt01 = (int) myDouble01;
        System.err.println("Type cast (double -> int) : " + myInt01);
    }
}
