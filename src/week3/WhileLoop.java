package week3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        //Find the factorial for the given number
/*
        5!= 5*4*3*2*1=120
        5!= 1*2*3*4*5=120
        8!=8*7*6*5*4*3*2*1=40320
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Factorial number for calculation : ");

        int fact = scan.nextInt(); // 7! = ? --> 7*6*5*4*3*2*1
        int result = 1;
        int counter =0;
        while(fact >= 1){
            result = result * fact;
            fact--;
            counter++;
            System.out.println(result);

        }
        System.out.println(counter + "! = " + result);


        //print the numbers from 1 to 100 only even numbers
        // output : 2 ,4,6,8,10..100

//        System.out.println("Please enter the highest number to write even numbers : ");
        int even =1;
        while(even <= 100){

            if(even == 100) System.out.print(even);
            else if(even % 2 == 0) System.out.print(even + ",");

            even++;
        }

        System.out.println();

        int odd =1;
        while(odd <= 100){

            if(odd == 99) System.out.print(odd);
            else if(odd % 2 != 0) System.out.print(odd + ",");

            odd++;
        }

    }
}
