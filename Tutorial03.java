/* 
Explaining the final keyword:

1) Variables: For variables final keyword is used to declare the constant variables, means the value of the variable cannot be override.

2) Methods: For methods the final keyword usually means that the method cannot be override, means we cannot overload a method , basically it prevents method overloading for a specific function/Method.

3) Class: For classes the final keyword usually means, The class cannot be extended forwards, basically it prevents inheritance for a specific class.


=> The two topics of 'Methods with final' & 'Classes with final' are discussed further.
*/


public class Tutorial03 {
    public static void main(String[] args) {

        // Variables with final

        final int MONTHS_IN_YEAR = 12;
        System.err.println("variable declared with the final keyword (MONTHS_IN_YEAR) : " + MONTHS_IN_YEAR);
    }  
}