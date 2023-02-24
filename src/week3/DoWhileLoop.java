package week3;

public class DoWhileLoop {
    /*
        while (condition){ condition= true
            //statement
         }

         do{ The code is going to be executed although the condition is false in the first time.
            //statement
            //
            //
         }while (condition); If the condition is true and do while loop will continue to execute.
         */

    public static void main(String[] args) {
        // if x < 10 ADD THE X VALUE TO TOTAL VARIABLE. (X = 4)
        int  x = 11;
        int total= 0;
        while(x<10){
            total = total + x; // total += x
            x++;
        }
        System.out.println("Total number : " + total);

        total = 0;
        do{
            total += x;
            x++;
        }while(x<10);

        System.out.println("Total Number from do while loop : " + total);

    }

}
