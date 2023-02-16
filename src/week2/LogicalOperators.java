package week2;

import java.applet.Applet;

public class LogicalOperators {
    /* Logical Operators
    1) && —> “And” operator
        true&&true --> true
        true&&false --> false
        false&&true --> false
        false&&false --> false
        Note: If 0 is false and 1 is true,“&&” operation is similar to multiplication of 0 and 1
     */

    public static void main(String[] args) {
        if(5>7 && 10>6) //False && True -->false
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5>7 && 10<6) //False && False -->false
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5<7 && 10>6) //True && True -->true
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5<7 && 10<6) //True && False -->false
            System.out.println("Apple:");
        else
            System.out.println("Grape:");


        /* 2) || —> “Or” operator
                true  || true -->true
                true  || false-->true
                false || true -->true
                false || false-->false
        Note: If 0 is false and 1 is true,“||” operation is similar to addition 0 and 1.
         */
        if(5>7 || 10>6) //False || True -->true
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5>7 || 10<6) //False || False -->false(Grape)
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5<7 || 10>6) //True || True -->true
            System.out.println("Apple:");
        else
            System.out.println("Grape:");

        if(5<7 || 10<6) //True || False -->true
            System.out.println("Apple:");
        else
            System.out.println("Grape:");


        /*
        3) ! —> “Not” operator
        !(true) = false
        !(false) = true

         */

        if(!(5>7) && 10>6)  //true --> Apple
            System.out.println("Apple");
        else
            System.out.println("Grape");

        if(5>7 || !(10>6))  //false --> Grape
            System.out.println("Apple");
        else
            System.out.println("Grape");


    }
}
