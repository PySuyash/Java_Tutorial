// Java class constructor.

/*
A constructor is a special type if function inside a class which is called when class object is initilized. It is generally used to perform taska that are required to run when an object is created. If you do not define a constructor explictly the java will create automatically but we cannot initilize value.
*/

public class Tutorial15 {

    int x;
    // Constructor of the Tutorial15 class.
    public Tutorial15 (int y) {
        System.out.println("Constructor is initilized ...........");
        x = y;
    }

    public static void main(String[] args) {
        Tutorial15 obj = new Tutorial15(5);
        System.out.println("Value is initilized using the constructor method of class : " + obj.x);
    }   
}
