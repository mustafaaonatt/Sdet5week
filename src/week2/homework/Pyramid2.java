package week2.homework;

public class Pyramid2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 5-1; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <=5; k++){
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
