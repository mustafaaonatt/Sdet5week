package week3;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator syntax
        // expression1 ? expression2 : expression3
        // NESTED Ternary Operator : (expression1 ? (expression2 ? Expression6 : Expression7) : (expression3 ? Expression4 : Expression5))
        //  condition_is_correct ? result1 : accept_result2

        int a = 3;
        if(a > 3){
            System.out.println("A is greater");
        } else {
            System.out.println("A is smaller");
        }

        String result;
        result = a > 3 ? "A is greater" : "A is smaller";
        System.out.println(result);
        System.out.println(a > 3 ? "A is greater" : "A is smaller");

        // math >= 45 and math <60  --> MathGrade : D("you grade is D" otherwise  "We didn't find your grade"
        int math = 65;
        String mathGrade = (math >= 45 && math <60) ? "Your Math subject grade is D." : "We didn't find your Math grade.";
        System.out.println(mathGrade);

        // b, c, d integer variables. Find the biggest one.
        int b,c,d;
        b = 3;
        c = 4;
        d = 6;
        String biggest = (d>=b) ? ((d>=c) ? "d is the biggest." : "c is the biggest") : (b>=c) ? "b is the biggest." : "c is the biggest.";
        System.out.println(biggest);
        if(d>=b){
            if(d>=c){
                System.out.println("d is the biggest.");
            }else System.out.println("c is the biggest");
        }else if(b>=c){
            System.out.println("b is the biggest.");
        }else {
            System.out.println("c is the biggest.");
        }



    }
}
