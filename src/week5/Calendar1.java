package week5;

import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args) {
        //Write a Java program to create a Date object using the Calendar class.
        int year = 2023;
        int month = 0; // 0-January 1-February 2-March 3-April 4-May 5-June
        int date = 1;

        Calendar calendar = Calendar.getInstance();
        // Sets the given calendar field value and the time value
        calendar.clear();
        System.out.println();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        System.out.println(calendar.getTime());

    }
}
