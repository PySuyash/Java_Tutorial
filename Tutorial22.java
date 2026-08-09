// About abstract classes and methods in java.

/*

Abstract Classes : Objects of abstract class are not created, Means you cannot initiate a abstract class.

Abstract Methods : These methods are defined inside the abstract classes and they don't have the body. Their functionality is defined inside the inherited child class.

*/


// Import the Scanner class from java.utils to get the user input.
import java.util.Scanner;

// Creating an abstract class.
abstract class MyAbstractClass {

    // Creating a variable (secure) bank pass.
    String _BANK_PASS_ = "rtGy&^hyu";


    // Method to get the bank pass.
    void getBankPass() {
        System.out.println("Bank Pass: " + _BANK_PASS_);
    }


    // Method to set the pass.
    void setBankPass(String newPass) {
        _BANK_PASS_ = newPass;
    }


    // Abstract method.
    abstract void cName(); // Definition provided in the BankInfo method.
}


// Creating another class extending the abstract class.
class BankInfo extends MyAbstractClass {

    int _PASS_KEY_ = 4563;

    // initiating the sc object of the Scanner class.
    Scanner sc = new Scanner(System.in);

    void Bank_Pass() {

        // Taking the input from the user for security purposes.
        System.out.print("Validate _PASS_KEY_: ");
        int userPassKey = sc.nextInt();
        sc.close();

        // Validating the user input.
        if (userPassKey == _PASS_KEY_) {

            // Calling the parent class method to get the bank pass. 
            getBankPass();   
        } else {
            System.err.println("ACCESS DENIED: INVALID PASS KEY");
        }
    }


    // Definition of abstract method cName.
    void cName() {
        System.out.println("This is the abstract method and the definition is defined inside the BankInfo method (child method)");
    }
}

public class Tutorial22 {
    public static void main(String[] args) {

        // Creating the object of the BankInfo class.
        BankInfo BI = new BankInfo();
        BI.Bank_Pass();
        BI.cName();
    }
}
