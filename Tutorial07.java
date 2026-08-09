// About conditional statments -> if, else, if-else, else-if, switch.

public class Tutorial07 {
    public static void main(String[] args) {

        // if statement -> Runs code if a specific condition is true.
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("It's raining outside");
        }

        // else statement -> Runs code if the 'if' block fails, i.e., if a specific condition is not true.
        boolean isNum = false;
        if (isNum) {
            System.out.println("It's a num");
        } else {
            System.out.println("No, It's not a num");
        }

        // else if statement -> Check for a specific condition, If not matched then check another condition inside the else if block , If it also false then runs the code in the else block.
        int num = 4;
        if (num > 6) {
            System.out.println("Number is greater than 6");
        } else if (num > 3) {
            System.out.println("Number is greater than 3");
        } else {
            System.out.println("Number is error");
        }

        // Shorthand of if else, using the ternary operator
        char ch = 'S';
        boolean result = (ch == 'S') ? true : false;
        System.out.println("Is ch == 'S' : " + result);

        // Nested if, placing if inside another if.
        int number = 5;
        if (number == 5) {
            System.out.println("Number is 5");
            if (number < 6) {
                System.out.println("number is less than 6");
            }
        }

        // switch keyword : instead of using multiple if else, we simply use the switch with a default statement.
        int day = 2;
        switch (day) {
            case 0 :
                System.out.println("day = 0 : Sunday");
                break;
            case 1: 
                System.out.println("day = 1 : Monday");
                break;
            case 2: 
                System.out.println("day = 2 : Tuesday");
                break;
            case 3: 
                System.out.println("day = 3 : Wednesday");
                break;
            default:
                System.out.println("Just a random day");
                break;
        }
    }
}
