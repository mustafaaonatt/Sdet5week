package week4;

import java.util.Locale;

public class ArraysHomework4_6 {
    public static void main(String[] args) {
        //4. Writ numberArre a Java program to test if an array contains a specific value. For example an int array contains 99 or not?
        int numberArr[] = {344,555,66,88,999,66,55};
        int number = 88;
        System.out.println(contains(numberArr,number));

        boolean check = contains(numberArr, 111);
        System.out.println(check);
//        contains(new int[]{344, 555, 66, 88, 999, 66, 55, 33}, 99);

        // Qestion 5:
        String arrayCar [] = {"BMW", "HONDA", "TOYOTA", "KIA", "HYUNDAI", "AUDI"};
        String carElement = "Kia";
        int indexNumber = findIndexOfElement(arrayCar, carElement);

        if(indexNumber != -1) System.out.println("carElement's index number is " + indexNumber);
        else System.out.println("There is no such an element in arrayCar.");


    }

    public static boolean contains(int arr[], int specificNumber){
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == specificNumber) result = true;
        }

        return result;
    }

//    5. Write a Java program to find the index of an array element.
        public static int findIndexOfElement(String arr[], String element){
            int result =-1;
            for(int i = 0; i < arr.length; i++){

                if(element.toUpperCase().equals(arr[i].toUpperCase())) result = i;
            }

        return result;
        }
}
