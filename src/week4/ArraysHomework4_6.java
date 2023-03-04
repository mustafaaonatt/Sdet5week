package week4;

import java.util.Locale;

public class ArraysHomework4_6 {
    public static void main(String[] args) {
        //4. Write a Java program to test if an array contains a specific value. For example an int array contains 99 or not?
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


        //Question 6 :
        removeElement(arrayCar,"KIA");
        removeElement2(arrayCar, "TOYOTA");

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

//        6. Write a Java program to remove a specific element from an array.
        public static void removeElement(String arr[], String removeElement){
        int counter = 0;
        for(String str : arr){
            if(str.equals(removeElement)){
                //Solution 1:
                int indexNum = findIndexOfElement(arr,removeElement);
                arr[indexNum] = "free-2";
                System.out.println(arr[indexNum] + " -->index number : " + indexNum);

                //Solution 2 :
                arr[counter] = "free-1";
                System.out.println(arr[counter] + " -->index number : " + counter);


            }
        counter++;
        }

        }

            //Solution 3 : arr [] = {"BMW", "HONDA", "TOYOTA", "KIA", "HYUNDAI", "AUDI"};
        public static void removeElement2(String arr[], String removeElement){
            for(int i = 0; i<arr.length; i++){
                if(arr[i].equals(removeElement)) {
                    arr[i] = "EMPTY";
                    System.out.println(arr[i] + " -->index number : " + i);
                    break; // exit from for loop immediately.
                }else if(i == arr.length-1) System.out.println("There is no such an element in the array.");

            }

        }
}
