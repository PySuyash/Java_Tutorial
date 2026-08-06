// About Recursion

/* A method continously call itself this phenomenon is called recursion. */

public class Tutorial10 {

    // Recursive method to find the sum of a range of number.
    static int findSum(int num) {
        if (num > 0) { 
            return num + findSum(num - 1); // Here, the function is calling itself, Recursion.
        } else {
            return 0;
        }
    }


    // A method that adds the number within a given range.
    static int addInRange(int start, int end) {
        if (end > start) {
            return end + addInRange(start, (end - 1));
        } else {
            return end;
        }
    }

    // Calculate factorial using recursion.
    static int fact(int a) {
        if (a == 1 || a == 0) {
            return 1;
        }

        if (a < 0) {
            System.err.println("Factorial of negative numbers are not allowed.");
        }

        if (a > 1) {
            return a * fact(a-1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {

        // Calling a recursive method.
        int result = findSum(5);
        System.out.println("The sum of the digits from 5 to 0 is : " + result);

        // Calling the method addInRange.
        int result1 = addInRange(5, 10);
        System.out.println("Sum of numbers from : 5 to 10 : " + result1);

        // Calling the factorial method.
        int fact_result = fact(5);
        System.out.println("The factorial of 5 is : " + fact_result);
    }
} 
