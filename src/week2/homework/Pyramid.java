package week2.homework;

public class Pyramid {
    public static void main(String[] args) {
        /*
        Program to print half pyramid using *
        result should be like this;
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        for(int i = 1; i < 6; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println(); // the cursor is jumping to the next line
        }

        System.out.println("===============");
        /**
         Inverted half pyramid using *
         result should be like this;
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for(int i = 5; i > 0; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=============");

        /**Program to print half pyramid a using numbers
         result should be like this;
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        /**Inverted half pyramid using numbers
         result should be like this;
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */

        for(int i = 5; i > 0; i--){

            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        /**
         * Program to print half pyramid using alphabets
         * result should be like this;
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E
         */
//        System.out.println((char)64); // A,65 - B,66 - C,67
        for(int i =1; i<=5; i++){

            for(int j = 1; j<=i; j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}
