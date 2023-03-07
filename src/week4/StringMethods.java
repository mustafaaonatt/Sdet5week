package week4;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "   Python";
        String str3 = "Java Script.";

        // length() method : Length of String > .length()
        int stringLength = str1.length();
        System.out.println("str1 length is : " + stringLength);

        // equals() method :
        boolean equalOrNOt = str1.equals("Java");
        System.out.println(equalOrNOt);

        //charAt() method :
        char charAtReturn = str2.charAt(3);
        System.out.println(charAtReturn);

        // concat() method : this method is connecting two Strings.
        String newStr2 = str2.concat(" Programming Language.              ");
        System.out.println(newStr2);
        System.out.println(str1.concat(" Programming Language."));
        System.out.println(newStr2.equals(str2.concat(" Programming Language.")));

        //indexOf() method :
        System.out.println(str3.indexOf("S"));

        // replace() method :
         System.out.println(str3.replace('a','i'));

         //startsWith() method
        System.out.println(str2.startsWith("Py"));

        //endsWith() method
        System.out.println(str3.endsWith("?"));

        //substring(int beginIndex) method
        System.out.println(str3.substring(7));

        //substring(int beginIndex, int endIndex) method
        System.out.println(newStr2.substring(7, 18));

        // toCharArray()
        System.out.println(Arrays.toString(str1.toCharArray()));

        //trim() method  : removing the spaces front and end of the string.
        System.out.println(newStr2.trim());

        // compareTo() method
        System.out.println(str1.compareTo(str2));

        //ESCAPE characters in String
        String str4 = "This is the \"String\" class.\n 'A' ";
        System.out.println(str4);

        // Creating the strings using the new keywords :
        String name = new String("Java String");
        System.out.println(name);

        // append() method
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);

        //insert() method
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(2, "Java"); // Now original string is changed
        System.out.println(sb1);

        // replace() method : The replace() method replaces the given string from the specified beginIndex and endIndex-1.
        StringBuffer sb2=new StringBuffer("Hello");
        sb2.replace(1,3,"Java");
        System.out.println(sb2);

        // delete() method : The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1.
        StringBuffer sb3=new StringBuffer("Hello");
        sb3.delete(1,3);
        System.out.println(sb3);

        // reverse() method : The reverse() method of StringBuilder class reverses the current string
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.reverse();
        System.out.println(sb4);








    }
}
