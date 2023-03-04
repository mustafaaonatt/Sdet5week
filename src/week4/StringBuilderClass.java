package week4;

public class StringBuilderClass {
    public static void main(String[] args) throws Exception{
        // create a StringBuilder object with a String pass parameter
        StringBuilder str = new StringBuilder("AAAABBBCCCC");

        //PRINT THE STRING
        System.out.println("String = " + str.toString());

        //reverse the string
        StringBuilder reverseStr = str.reverse();
        System.out.println("Reverse String = " + reverseStr.toString());

        //Append ', '(44) to the String
        str.appendCodePoint(44);

        //print the modified String
        System.out.println("Modified StringBuilder = " + str);

        //get capacity
        int capacity = str.capacity();

//      print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = " + capacity);


    }
}
