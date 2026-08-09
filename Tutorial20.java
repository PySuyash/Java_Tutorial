// Super keyword in Java

/*
Super keyword is used to refer to the parent class, 
To call the methods from parent class or to call the parent class constructor.
*/


// Super class.
class Parent {

    int NUM = 10;

    // Creating the constructor of the parent class.
    Parent(int n) {

        // Setting the value of NUM of Parent class using the Parent class constructor to n.
        this.NUM = n;
        System.out.println("Parent class constructor is initiated .....");
    }

    public void Greet() {
        System.out.println("Good Morning");
        System.out.println("The value of NUM in parent class : " + NUM);
    }
}

// Child Class extending the parent class.
class Child extends Parent {

    int NUM = 20;

    // Creating child class constructor.
    Child(int m, int n) {

        // Passing the value of NUM to the parent class constructor using the super keyword. The super keyword must be the very first argument in the constructor.
        super(n);

        // setting the value of NUM of the Child class to m using the Child class constructor.
        this.NUM = m;
        // Calling the parent class constructor.
        System.out.println("Child class constructor is initiated .....");
    }

    // method with same name as parent class.
    public void Greet() {

        // Calling the parent class method Greet() with super keyword.
        super.Greet();
        System.out.println("Good Evening");
        System.out.println("The value of NUM in child class : " + NUM);
    }
}

public class Tutorial20 {
    public static void main(String[] args) {

        // Initiating the object of the child class. And passing the value of m, n respectively.
        Child C = new Child(30, 20);

        // Calling the Greet() method of the child class.
        C.Greet();
    }    
}
