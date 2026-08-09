// Taking input in java from user.

import java.util.Scanner;

public class Tutorial11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a int number : ");
        int num = sc.nextInt();

        System.out.println("Your number : " + num);

        sc.close();
    }   
}
