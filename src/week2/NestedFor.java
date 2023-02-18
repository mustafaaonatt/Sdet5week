package week2;

public class NestedFor {
    public static void main(String[] args) {
        /**
         * Nested Loops
         * It is also possible to place a loop inside another loop. This is called a nested loop.
         * The "inner loop" will be executed one time for each iteration of the "outer loop":
         */

        // Outer Loop
        for(int i = 1; i <= 3;i++){
            System.out.println("Outer loop : " + i);    //Executes 3 times

            //Inner Loop
            for(int j = 1; j <=5; j++){
                System.out.println("Inner lopp : " + j);    //Executes 5 times
            }

            System.out.println("here is in outer loop.");
        }
    }
}
