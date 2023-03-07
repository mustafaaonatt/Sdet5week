package week4;

public class StringHW {
    public static void main(String[] args) {
        //1. Write a Java program to get the character at the given index within the String.
        //Sample Output:
        //Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i

        String str = "Java exercises!";
        char chr = str.charAt(7);
        System.out.println(chr);

        //2.Write a Java program to compare two strings lexicographically.
        // Two strings are lexicographically equal if they are the same length
        // and contain the same characters in the same positions.

        //Sample Output:
        //String 1: This is Exercise 1
        //String 2: This is Exercise 2
        //"This is Exercise 1" is less than "This is Exercise 2"

        String str1 = "Hello World";
        String str2 = "Hello World";
        int result = str1.compareTo(str2);
        if(result<0) System.out.println("str1 is less than str2.");
        else if(result == 0) System.out.println("str1 and str2 are equals.");
        else //if(result > 0
            System.out.println("str1 is greater that str2");

    }
}
