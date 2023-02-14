package week2;

import java.util.Scanner;

public class IfElseIf {
    /**
     * Java has the following conditional statements:
     *
     * Use if to specify a block of code to be executed, if a specified condition is true
     * Use else to specify a block of code to be executed, if the same condition is false
     * Use else if to specify a new condition to test, if the first condition is false
     * Use switch to specify many alternative blocks of code to be executed
     */

    /**
     * if (condition1) {
     *   // codes
     * }
     * else if(condition2) {
     *   // codes
     * }
     * else if (condition3) {
     *   // codes
     * }
     * .
     * .
     * else {
     *   // codes
     * }
     *
     */

    /**
     * example, assigning grades (A, B, C) based on the percentage obtained by a student.
     * if the percentage is above 90, assign grade A
     * if the percentage is above 75, assign grade B
     * if the percentage is above 65, assign grade C
     * else the student failed.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the grade percentage : ");
        int percentage = scan.nextInt();
        char grade;

        if(percentage >= 90){
            grade = 'A';
        }else if(percentage >= 75){
            grade = 'B';
        }else if(percentage >= 65){
            grade = 'C';
        }else grade ='F';

        System.out.println(grade);
        System.out.println("this codeline will be executed for any condition...");
    }
}
