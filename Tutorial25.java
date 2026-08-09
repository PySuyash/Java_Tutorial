// Java Enums.

/*
enum is a special class that represents a group of constants.
We can declare enum inside class also.
We can use it with switch.
*/

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Tutorial25 {
    public static void main(String[] args) {

        Level L = Level.MEDIUM;
        System.out.println(L);

        System.out.println("");
        System.out.println("Loop begins from here.");

        // Loop through enum => .values() method is used to loop.
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
