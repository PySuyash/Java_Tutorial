// String in Java
// Sting is the collection of characters surronded with quotes.

public class Tutorial05 {
    public static void main(String[] args) {
        String name = "Suyash"; 
        System.err.println("Name is : " + name);

        // Length is string.
        System.err.println("Numbers of charcters in Suyash : " + name.length());

        // Changing the case of string.
        System.err.println("Upper case of suyash : " + name.toUpperCase());
        System.err.println("Lower case of SUYASH : " + name.toLowerCase());

        // finding the index of a specific char or word in the string using the indexOf() method.
        String text1 = "Hello, Myself Suyash";
        System.err.println("Index of the char 'S' in the string :  " + text1.indexOf("Suyash"));

        // finding the specific character in a text at a specific index.
        System.err.println("Finding the char at the index 4 in the word 'Suyash' : " + name.charAt(4));

        // Comparing two strings use the equals() method 
        String text2 = "Hello";
        String text3 = "Hello";
        System.err.println("Comparing the string 'Hello' & 'Hello' : " + text2.equals(text3));

        // To remove the leading and trailing whitespaces use the trim() mtehod.
        String text4 = "    Hello   ";
        System.err.println("Before using the trim() method : " + text4);
        System.err.println("After using the trim() method : " + text4.trim());


        // Concatinating two strings
        // 1) Using the + operator
        System.err.println("Hello this is string1" + " " + "And this is string 2 concatinated using the + operator.");
        // 2) Using the concat method
        System.err.println("This is string1 ".concat("And this is string2 concat using the 'concat()' method"));

        // Numbers and Strings 
        // If you use the + operator with a string and a number the result will be a string.
        System.err.println("Result of adding a string '10' to a number 20 : " + "10" + 20);
    }   
}
