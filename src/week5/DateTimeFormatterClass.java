package week5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        /**
         * 2023/01/13
         * 2023/13/01
         * 23/13/01
         * 23/01/13
         * 13/01/2023
         * 01/13/2023
         * January 1st, 2023
         * 13/Jan/2023
         * 13.Jan.2023
         * 13-Jan-2023
         */

        /** Date patterns
         * yyyy-MM-dd
         * yyyy/MM/dd
         * dd-MM-yyyy
         * dd/MM/yyyy
         * E, MMM dd yyyy
         * E, dd MMM yyyy
         * EEE, MMM dd, yyyy
         * EEE, dd MMM, yyyy
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDate myDate = LocalDate.now();
        System.out.println("myDate = " + myDate);
        String afterFormat = dtf.format(myDate);
        System.out.println("afterFormat = " + afterFormat);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd, MMM, YY");
        afterFormat = dtf1.format(myDate);
        System.out.println("afterFormat = " + afterFormat);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d-MMMM-YYYY");
        afterFormat = dtf2.format(myDate);
        System.out.println("AfterFormat = " + afterFormat);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE, dd MMM yyy");
        myDate = myDate.plusMonths(5);
        afterFormat = dtf3.format(myDate);
        System.out.println("afterFormat = " + afterFormat);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
        afterFormat = dtf4.format(myDate);
        System.out.println("afterFormat = " + afterFormat);

/** Time patterns
 *HH:mm:ss.SSS
 * HH:mm:ss
 * hh:mm a
 * hh:mm:ss a
 * K:mm a, z
 * H:mm
 * K:mm:ss a
 * H:mm:ss
 */
        LocalTime time = LocalTime.now();
        System.out.println("present time = " + time);
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
        afterFormat = dtf5.format(time);
        System.out.println("afterFormat = " + afterFormat);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("HH:mm:ss");
        afterFormat = dtf6.format(time);
        System.out.println("afterFormat = " + afterFormat);



    }
}
