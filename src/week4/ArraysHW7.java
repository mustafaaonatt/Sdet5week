package week4;

import java.util.Arrays;

public class ArraysHW7 {
    //7. Write a Java program to copy an array by iterating the array.
    public static void main(String[] args) {
        String str[] = {"orange", "red", "yellow", "blue", "white", "black", "green", "brown"};
        System.out.println("Source Array : " + Arrays.toString(str));
        String newStr[] = new String[6];
        int checkIndexNumber = 0;

        if(str.length == newStr.length)checkIndexNumber = str.length;
        else if(str.length> newStr.length) checkIndexNumber = newStr.length;
        else checkIndexNumber = str.length;


        for(int i = 0; i < checkIndexNumber; i++){
            newStr[i] = str[i];
        }
        System.out.println("New Array : " + Arrays.toString(newStr));
    }
}
