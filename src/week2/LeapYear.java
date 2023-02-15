package week2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        Question 1:
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the current year : ");
        int year = scan.nextInt();

        //Solution 1:
        if(year % 4 == 0) System.out.println("This year is a Leap year.");
        else System.out.println("This is not a leap year.");

        //Solution 2:
        String result;
        result = (year % 4 == 0) ? "This is a Leap year." : "This year is not a Leap year.";
        System.out.println(result);

        //Solution 3:
        int result1;
        result1 = (year % 4 == 0) ? 4 : -1;
        if(result1 == 4) System.out.println("Leap year.");
        else System.out.println("Not Leap year");


    }
}
