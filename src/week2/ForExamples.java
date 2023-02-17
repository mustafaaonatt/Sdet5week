package week2;

import java.util.Scanner;

public class ForExamples {

    public static void main(String[] args) {
        //Find the factorial for the given number
/*
        5!= 5*4*3*2*1=120
        5!= 1*2*3*4*5=120
        8!=8*7*6*5*4*3*2*1=40320
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number from 1 to 10 : ");
        int fact = scan.nextInt();
        int result= 1;
        for(int mult = 1; mult<=fact; mult++ ){ //  mult        result
        result = result * mult;  // result *= mult            //      1 2 3 4 5      *result --> 2--> 6 -->24 -->120

            //1  =  1 * 1
//        2  =  1 * 2
//        6  =  2 * 3
//        24  =  6 * 4
//        120 = 24 * 5
        }
        // 3! = 3*2*1 = 6
        // 4! = 4*3*2*1 = 24
        // 5! = 5*4*3*2*1 = 120

        System.out.println("Result of " +  fact +"factor is " + result);
    }
}
