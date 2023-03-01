package week4;

public class myArray {
    public static void main(String[] args) {
        int myArray[] = new int[3]; //-->{0,0,0} default initial value
        myArray[0] = 7;
        myArray[1] = 15;
        myArray[2] = 42;
//        myArray[3] = 78;   --> ArrayIndexOutOfBoundsException
//        myArray[4] = 99;   --> ArrayIndexOutOfBoundsException
        System.out.println("myArray length is : " + myArray.length);

        int myArray1[] = {8,15,36};

        int element1 = myArray[0];
        int element2 = myArray[1];
        int element3 = myArray[2];
        System.out.println("element1 value is " + element1);
        System.out.println("element2 value is " + element2);
        System.out.println("element3 value is " + element3);

        element1 = myArray1[0];
        element2 = myArray1[1];
        element3 = myArray1[2];

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);     // output --> 7 15 42
        }

        String fruits[] = {"Apple", "Banana", "Orange", "Avocado", "Strawberry"};

        System.out.print("Fruits name : ");

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + ", ");
        }

        /**Exercise:
         Type a program like; given an array whose length is 3, return an array with the
         elements "rotated left"
         For example; if the array is [7, 15, 42] output will be [15, 42, 7].
        */
        System.out.println();
        int temp = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(i+1 != myArray.length) myArray[i] = myArray[i+1];
            else myArray[i] = temp;

            if(i != myArray.length-1) System.out.print(myArray[i] + ", ");
            else System.out.print(myArray[i]);
        }
        int reversed[] = new int[3];
        int counter = 0;
        System.out.println();
        for(int i = myArray.length-1; i >= 0; i--){
            reversed[counter] = myArray[i];
            System.out.print(reversed[counter]);
            counter++;
        }


    }
}
