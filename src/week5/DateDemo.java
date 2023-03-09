package week5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Create the Date object
        Date date = new Date();
        // display time and date using toString() method

        System.out.println(date.toString());

        SimpleDateFormat df = new SimpleDateFormat("yy.dd.MM 'at' hh:mm:ss a zzz");
        System.out.println("Current Date : " + df.format(date));
    }
}
