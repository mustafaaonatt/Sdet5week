package week5;

public class ReturningValues {
    public static void main(String[] args) {
        int number = 1;         // 1
        String letters = "abc"; // abc

        number(number);         // 1? 2?

        letters = letters(letters); // abcd

        System.out.println(number + letters); // 1abcd

    }

    public static int number(int number) {
        number++; // 1 + 1 ---> number = number + 1
        return number;
    }

    public static String letters(String letters) {
        letters = letters + "d";
        return letters;
    }


}
