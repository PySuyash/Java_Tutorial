// About loops: while, do-while, and for.

public class Tutorial08 {
    public static void main(String[] args) {
        
        // while loop repeats a block of code as long as a condition is true.
        int num = 0;
        while (num < 6) {
            System.out.println(num);
            num ++;
        } 

        // do-while loops is a varient of while loop, but they check the condition after executing atleast once.
        int i = 10;
        do {
            System.out.println("The value of i is 10, but condition is i < 5 (do-while) : " + i);
            i ++;
        } while (i < 5);


        // for loop : When you exactly know how many times you need to run a specific block of  code use the for loop.
        for (int f = 0; f <= 5; f ++) {
            System.out.println("F : " + f);
        }

        // Nested for loops: The inner loop will execute completely for each iteration of the outer loop
        for (int x = 0; x <= 1; x ++) {
            System.out.println("Outer loop");
                for (int y = 0; y <=4; y ++) {
                    System.out.println("Inner loop");
                } 
        }

        // for each loop: This loop is generally used with arrays.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println("Cars : " + car);
        }

        int[] nums = {1,2,3,4,5};
        for (int x: nums) {
            System.out.println("nums : " + x);
        }

        // break keyword: The break keyword is used to jump out from loop at specific condition.
        for (int t = 0; t <= 10; t ++) {
            if (t == 5) {
                break;
            }
            System.out.println("T : " + t);
        }

        // continue keyword: The continue keyword is used to skip a specific condition in loop.
        for (int w = 0; w <= 10; w ++) {
            if (w == 5) {
                continue;
            }
            System.out.println("W : " + w);
        }
    }
}
