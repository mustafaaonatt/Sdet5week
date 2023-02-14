package week1;

public class OperatorsSigns {
    public static void main(String[] args) {
        //Operator Signs in Java :

//        1) = —> Assignment Operator in Java
        int num1 = 12;
        boolean isOld = true;

//        2)	= = —> Equal Sign or Comparison Operator in java
        boolean isTrue = 5 + 2 == 7;    //true
        boolean isFalse = 13 + 4 == 71; //false
        System.out.println(isTrue);
        System.out.println(isFalse);

//        3)	!= —> Not Equal Sign in java
        isTrue = 5 + 2 != 7;    //false
        isFalse= 13 + 4 != 71; //true
        System.out.println(isTrue);
        System.out.println(isFalse);

//        4) “>” —> “Greater than” sign in java
        isTrue = 12 > 13;
        System.out.println("12 > 13 --> true or false? " + isTrue);

//        5)	“<”  —> “Less than” sign in java
        isTrue = 12 < 13;
        System.out.println("12 < 13 --> true or false? " + isTrue);

//        6)	“>=” —> “Greater than or equal to” sign in java

        System.out.println("12 >= 13 --> true or false? " + (12 >= 13));
        System.out.println("12 >= 12 --> true or false? " + (12 >= 12));


//        7)	“<=” —> “Less than or equal to” sign in java
        System.out.println("12 <= 13 --> true or false? " + (12 <= 13));
        System.out.println("12 <= 12 --> true or false? " + (12 <= 12));


    }
}
