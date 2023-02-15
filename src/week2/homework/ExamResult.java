package week2.homework;

import java.util.Scanner;

public class ExamResult {
    /*Homework-2
assign int mid term exam result between 0-100, int mtExam
then assign final exam result between 0-100, int
then calculate mid term exam of %40,and final exam %60,
if it is more than 70, print result as "Passed" and if it is less than 71, print the result failed.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your mid-term exam result(0-100) : ");
        int midTerm = scan.nextInt();
        System.out.println("Please enter your final exam result(0-100) : ");
        int finalExam = scan.nextInt();

        int termScore = (int)((midTerm * 0.40) + (finalExam * 0.6));
        System.out.println("Your Term score is " + termScore);
        if(termScore > 70){
            System.out.println("Congratulation you passed.");
        }else{
            System.out.println("Sorry to inform you that you failed.");
        }
    }
}
